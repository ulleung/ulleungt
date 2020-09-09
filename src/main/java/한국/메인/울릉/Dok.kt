package 한국.메인.울릉

import org.json.simple.JSONArray
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser
import 한국.메인.울릉.Antlr.ulleungParser
import java.io.*

class Dok(dokFiles: Array<File>) {

    var classList = ArrayList<Pair<String, String>>() // 번역본 클래스명 / 실제 클래스명
    var methodList = ArrayList<Triple<String, String, String>>() // 번역본 메서드명 / 번역본 클래스명 / 실제 메서드명
    var varList = ArrayList<Triple<String, String, String>>() //번역본 변수명 / 번역본 클래스명 / 실제 변수명

    init {
        var parser = JSONParser()

        for (file in dokFiles) {
            var jsonObject: JSONObject = parser.parse(BufferedReader(InputStreamReader(FileInputStream(file), "UTF-8"), )) as JSONObject

            var translations: JSONArray = jsonObject.get("translations") as JSONArray

            readDokFilesRecursive(translations, "this")
        }

        //Java 원시형
        classList.add(Pair("바이트", "byte"))
        classList.add(Pair("소정수", "short"))
        classList.add(Pair("정수", "int"))
        classList.add(Pair("대정수", "long"))
        classList.add(Pair("소수", "float"))
        classList.add(Pair("대소수", "double"))
        classList.add(Pair("문자", "char"))
        classList.add(Pair("유무", "boolean"))

        classList.add(Pair("문자열", "String")) //Java 원시형은 아니지만 public static main(String args[]) 에서 사용되는 관계로 추가
    }

    fun readDokFilesRecursive(array: JSONArray, parent: String) {
        for (i in 0 until array.size) {
            var jsonObject = array.get(i) as JSONObject

            if (jsonObject.get("종류") == "객체") {
                classList.add(Pair(jsonObject.get("번역") as String, jsonObject.get("원본") as String))
            } else if (jsonObject.get("종류") == "변수") {
                varList.add(Triple(jsonObject.get("번역") as String, parent, jsonObject.get("원본") as String))
            } else if (jsonObject.get("종류") == "함수") {
                methodList.add(Triple(jsonObject.get("번역") as String, parent, jsonObject.get("원본") as String))
            }

            var childrenArray = jsonObject.get("children") as JSONArray?

            if(childrenArray != null)
                readDokFilesRecursive(childrenArray, jsonObject.get("번역") as String)
        }
    }

    fun doesClassExist(name: String) : Boolean {
        classList.forEach {
            if(it.first == name)
                return true
        }
        return false
    }

    fun doesMethodExist(className: String, methodName: String) : Boolean {
        methodList.forEach {
            if(it.first == methodName && it.second == className)
                return true
        }
        return false
    }

    fun typeNameContextToClassName(ctx: ulleungParser.Type_nameContext?): String {
        var returnStringBuilder = StringBuilder()

        if (ctx?.package_name() != null)
            returnStringBuilder.append(ctx?.package_name()?.text)

        if (ctx?.package_name() != null && ctx?.IDENTIFIER() != null)
            returnStringBuilder.append(".")

        if (ctx?.IDENTIFIER() != null)
            returnStringBuilder.append(stringToClassName(ctx?.IDENTIFIER()?.text!!))

        return returnStringBuilder.toString()
    }

    fun typeNameArrayContextToClassName(ctx: ulleungParser.Type_name_arrayContext?): String {
        var returnStringBuilder = StringBuilder()

        if (ctx?.package_name() != null)
            returnStringBuilder.append(ctx?.package_name()?.text)

        if (ctx?.package_name() != null && ctx?.IDENTIFIER() != null)
            returnStringBuilder.append(".")

        if (ctx?.IDENTIFIER() != null)
            returnStringBuilder.append(stringToClassName(ctx?.IDENTIFIER()?.text!!))

        if (ctx?.ARRAY() != null)
            returnStringBuilder.append("[]")

        return returnStringBuilder.toString()
    }

    fun classNameFromPackage(packageName: String): String {
        return packageName.split(".").last()
    }

    fun stringToClassName(className: String): String {
        var returnString = ""

        var neededList = ArrayList<Pair<String, String>>()

        for (pair in classList) {
            if (pair.first == className)
                neededList.add(pair)
        }

        if (neededList.size > 1) {
            System.out.println("Dok 경고: %s 이(가) 번역명인 객체가 너무 많습니다. 첫번째 값인 %s (으)로 진행합니다.".format(className, neededList.get(0).second))
        }

        if (neededList.size == 0) {
            System.out.println("Dok 경고: %s 이(가) 번역명인 객체가 존재하지 않습니다. 원본 이름으로 계속합니다.".format(className))
            return className
        }

        returnString = neededList.get(0).second

        return returnString;
    }

    fun stringToMethodName(methodName: String, className: String): String {
        var returnString = ""

        var neededList = ArrayList<Triple<String, String, String>>()

        if (className == "this")
            return "";

        for (triple in methodList) {
            if (triple.first == methodName && triple.second == className)
                neededList.add(triple)
        }

        if (neededList.size > 1) {
            System.out.println("Dok 경고 : %s 에 %s 이(가) 번역명인 함수가 너무 많습니다. 첫번째 값인 %s (으)로 계속합니다.".format(className, methodName, neededList.get(0).third))
        }

        if (neededList.size == 0) {
            System.out.println("Dok 경고: %s 에 %s 이(가) 번역명인 함수가 존재하지 않습니다. 원본 이름으로 계속합니다.".format(className, methodName))
            return methodName
        }

        returnString = neededList.get(0).third

        return returnString
    }

    fun stringToVarName(varName: String, className: String): String {
        var returnString = ""

        var neededList = ArrayList<Triple<String, String, String>>()

        if (className == "this")
            return "";

        for (pair in varList) {
            if (pair.first == varName && pair.second == className)
                neededList.add(pair)
        }

        if (neededList.size > 1) {
            System.out.println("Dok 경고 : %s 에 %s 이(가) 번역명인 변수가 너무 많습니다. 첫번째 값인 %s (으)로 계속합니다.".format(className, varName, neededList.get(0).third))
        }

        if (neededList.size == 0) {
            System.out.println("Dok 경고: %s 에 %s 이(가) 번역명인 변수가 존재하지 않습니다. 원본 이름으로 계속합니다.".format(className, varName))
            return varName
        }

        returnString = varList.get(0).third

        return returnString
    }
}