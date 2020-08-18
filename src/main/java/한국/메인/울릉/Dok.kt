package 한국.메인.울릉

import 한국.메인.울릉.Antlr.ulleungParser

class Dok {

    var classList = ArrayList<Pair<String, String>>() // 번역본 클래스명 / 실제 클래스명
    var methodList = ArrayList<Pair<String, String>>() // 번역본 메서드명 / 실제 메서드명
    var varList = ArrayList<Pair<String, String>>() //번역본 변수명 / 실제 변수명

    init {
        // TODO: 외부 .dok 파일 읽어오기

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

    public fun packageNameContextToOriginalName(packageNamecontext: ulleungParser.Package_nameContext?) : String
    {
        var returnString = ""

        var neededList = ArrayList<Pair<String, String>>()

        for(pair in classList)
        {
            if(pair.first == packageNamecontext?.text)
                neededList.add(pair)
        }

        if(neededList.size > 1)
        {
            System.out.println("Dok 경고: %s 가 번역명인 객체가 너무 많습니다. 첫번째 값인 %s 로 진행합니다.".format(packageNamecontext?.text, neededList.get(0).second))
        }

        if(neededList.size == 0)
        {
            System.out.println("Dok 경고: %s 가 번역명인 객체가 존재하지 않습니다. 원본 이름으로 계속합니다.".format(packageNamecontext?.text))
            return packageNamecontext?.text!!
        }

        returnString = neededList.get(0).second

        return returnString;
    }
}