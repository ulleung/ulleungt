package 한국.메인.울릉.리스너

import 한국.메인.울릉.Antlr.ulleungBaseListener
import 한국.메인.울릉.Antlr.ulleungParser
import 한국.메인.울릉.Dok
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

class 울릉리스너(fos: FileOutputStream, dokFiles: Array<File>) : ulleungBaseListener() {
    var fos: FileOutputStream? = null;
    var sb: StringBuffer = StringBuffer()
    var dok = Dok(dokFiles)

    init {
        this.fos = fos
    }

    override fun exitProgram(ctx: ulleungParser.ProgramContext?) {
        fos?.write(sb.toString().toByteArray())
    }

    override fun exitDefine_package(ctx: ulleungParser.Define_packageContext?) {
        sb.append("package " + ctx?.package_name()?.text + ";")
    }

    override fun exitDefine_import(ctx: ulleungParser.Define_importContext?) {
        sb.append("import " + ctx?.package_name()?.text + ";")
    }

    override fun enterDefine_class(ctx: ulleungParser.Define_classContext?) {
        val publicType = ctx?.public_type()?.text
        when (publicType) {
            null -> sb.append("public ")
            "들춰진" -> sb.append("public ")
            "감춰진" -> sb.append("protected ")
            "숨겨진" -> sb.append("private ")
        }

        sb.append("class ")
        sb.append(ctx?.IDENTIFIER()?.text + " ")

        if (ctx?.EXTEND() != null) {
            sb.append("extends ")
            sb.append(dok.typeNameContextToClassName(ctx?.type_name()) + " ")
        }

        sb.append("{")
    }

    override fun exitDefine_class(ctx: ulleungParser.Define_classContext?) {
        sb.append("}")
    }

    override fun exitNew_object(ctx: ulleungParser.New_objectContext?) {
        sb.append("new " + dok.typeNameContextToClassName(ctx?.type_name()))
        if(ctx?.passed_args() == null)
            sb.append("()")
        else
            sb.append("(" + ctx?.passed_args()?.text + ")")
    }

    override fun enterDefine_global_var(ctx: ulleungParser.Define_global_varContext?) {
        val publicType = ctx?.public_type()?.text
        when (publicType) {
            null -> sb.append("public ")
            "들춰진" -> sb.append("public ")
            "감춰진" -> sb.append("protected ")
            "숨겨진" -> sb.append("private ")
        }

        if (ctx?.STATIC() != null)
            sb.append("static ")

        sb.append(dok.typeNameArrayContextToClassName(ctx?.type_name_array()) + " ")
        sb.append(ctx?.IDENTIFIER()?.text + " ")

        if (ctx?.EQUALS() != null)
            sb.append("= ")

        if(ctx?.VAR_VALUE() != null)
            sb.append(ctx?.VAR_VALUE())
    }

    override fun exitDefine_global_var(ctx: ulleungParser.Define_global_varContext?) {
        sb.append(";")
    }

    override fun enterDefine_function(ctx: ulleungParser.Define_functionContext?) {
        val publicType = ctx?.public_type()?.text
        when (publicType) {
            null -> sb.append("public ")
            "들춰진" -> sb.append("public ")
            "감춰진" -> sb.append("protected ")
            "숨겨진" -> sb.append("private ")
        }

        if (ctx?.STATIC() != null)
            sb.append("static ")

        if (ctx?.type_name_array() == null)
            sb.append("void ")
        else
            sb.append(dok.typeNameArrayContextToClassName(ctx?.type_name_array()) + " ")

        sb.append(ctx?.IDENTIFIER(0)?.text)

        sb.append("(")

        if (ctx?.args() != null) {
            for (i in 0 until ctx.args()?.IDENTIFIER()?.size!!) {
                if (i != 0)
                    sb.append(", ")

                sb.append(dok.typeNameArrayContextToClassName(ctx.args()?.type_name_array(i)))

                sb.append(" " + ctx.args()?.IDENTIFIER(i)?.text)
            }
        }

        sb.append(") {")
    }

    override fun exitDefine_function(ctx: ulleungParser.Define_functionContext?) {
        if (ctx?.RETURN() != null) {
            if (ctx.VAR_VALUE() != null) {
                sb.append("return " + ctx.VAR_VALUE()?.text + ";")
            }
            if (ctx.IDENTIFIER(1) != null) {
                sb.append("return " + ctx.IDENTIFIER(1)?.text + ";")
            }
        }

        sb.append("}")
    }

    override fun exitMethod(ctx: ulleungParser.MethodContext?) {
        if (ctx?.parent?.ruleIndex == ulleungParser.RULE_passed_arg)
            return
        if (ctx?.parent?.ruleIndex == ulleungParser.RULE_compare)
            return
        if (ctx?.parent?.ruleIndex == ulleungParser.RULE_for_statement)
            return

        var parentName = "this"

        if (ctx?.type_name() != null) {
            sb.append(dok.typeNameContextToClassName(ctx?.type_name()))
            parentName = ctx?.type_name()?.text!!
        }

        sb.append(".")

        if (ctx?.first_passed_args()?.passed_args() != null) {
            sb.append(dok.stringToMethodName(ctx?.IDENTIFIER(0)?.text!!, parentName))
            sb.append("(")
            sb.append(ctx.first_passed_args()?.passed_args()?.text)
            sb.append(")")
        } else if (ctx?.first_passed_args() != null) {
            sb.append(dok.stringToMethodName(ctx?.IDENTIFIER(0)?.text!!, parentName))
            sb.append("()")
        } else {
            sb.append(dok.stringToVarName(ctx?.IDENTIFIER(0)?.text!!, parentName))
        }

        parentName = ctx?.IDENTIFIER(0)?.text!!

        if (ctx?.IDENTIFIER().size > 1) {
            for (i in 1 until ctx.IDENTIFIER()?.size!!) {
                sb.append(".")
                if (ctx.passed_args(i-1) != null) {
                    sb.append(dok.stringToMethodName(ctx?.IDENTIFIER(i)?.text!!, parentName))
                    sb.append("(")
                    sb.append(ctx.passed_args(i-1)?.text)
                    sb.append(")")
                } else {
                    sb.append(dok.stringToVarName(ctx?.IDENTIFIER(i)?.text!!, parentName))
                    sb.append("()")
                }

                parentName = ctx?.IDENTIFIER(i)?.text!!
            }
        }

        sb.append(";")
    }

    override fun enterEquality(ctx: ulleungParser.EqualityContext?) {
        if (ctx?.parent?.ruleIndex == ulleungParser.RULE_for_statement)
            return

        sb.append(ctx?.IDENTIFIER(0)?.text + " = ")

        if (ctx?.calculation() != null) {
            sb.append(ctx.calculation()?.text)
        }
        if (ctx?.VAR_VALUE() != null) {
            sb.append(ctx.VAR_VALUE()?.text)
        }
        if (ctx?.IDENTIFIER(1) != null) {
            sb.append(ctx.IDENTIFIER(1)?.text)
        }
    }

    override fun exitEquality(ctx: ulleungParser.EqualityContext?) {
        if (ctx?.parent?.ruleIndex == ulleungParser.RULE_for_statement)
            return

        if (ctx?.method() == null)
            sb.append(";")
    }

    override fun enterDefine_var(ctx: ulleungParser.Define_varContext?) {
        if (ctx?.parent?.ruleIndex == ulleungParser.RULE_for_start)
            return

        sb.append(dok.typeNameArrayContextToClassName(ctx?.type_name_array()))
        if (ctx?.type_name_array()?.ARRAY() != null)
            sb.append("[]")
        sb.append(" " + ctx?.IDENTIFIER(0)?.text + " ")

        if (ctx?.EQUALS() != null) {
            sb.append("= ")
            if (ctx.calculation() != null) {
                sb.append(ctx.calculation()?.text)
            }
            if (ctx.VAR_VALUE() != null) {
                sb.append(ctx.VAR_VALUE()?.text)
            }
            if (ctx.IDENTIFIER(1) != null) {
                sb.append(ctx.IDENTIFIER(1)?.text)
            }
        }
    }

    override fun exitDefine_var(ctx: ulleungParser.Define_varContext?) {
        if (ctx?.parent?.ruleIndex == ulleungParser.RULE_for_start)
            return

        if (ctx?.method() == null)
            sb.append(";")
    }

    override fun enterDefine_for(ctx: ulleungParser.Define_forContext?) {
        sb.append("for(")

        if (ctx?.for_start()?.define_var() != null) {
            sb.append(dok.typeNameArrayContextToClassName(ctx.for_start()?.define_var()?.type_name_array()))

            if (ctx.for_start()?.define_var()?.type_name_array()?.ARRAY() != null)
                sb.append("[]")

            sb.append(" " + ctx.for_start()?.define_var()?.IDENTIFIER(0)?.text + " ")

            if (ctx.for_start()?.define_var()?.EQUALS() != null) {
                sb.append("= ")
                if (ctx.for_start()?.define_var()?.calculation() != null) {
                    sb.append(ctx.for_start()?.define_var()?.calculation()?.text)
                }
                if (ctx.for_start()?.define_var()?.VAR_VALUE() != null) {
                    sb.append(ctx.for_start()?.define_var()?.VAR_VALUE()?.text)
                }
                if (ctx.for_start()?.define_var()?.IDENTIFIER(1) != null) {
                    sb.append(ctx.for_start()?.define_var()?.IDENTIFIER(1)?.text)
                }
            }
        }
        if (ctx?.for_start()?.IDENTIFIER() != null)
            sb.append(ctx.for_start()?.IDENTIFIER()?.text)

        sb.append(";")

        sb.append(ctx?.booleans()?.text?.replace("이고", "&&")?.replace("이거나", "||")?.replace("참", "true")?.replace("거짓", "false"))

        sb.append(";")

        if (ctx?.for_statement()?.equality() != null) {
            sb.append(ctx.for_statement()?.equality()?.IDENTIFIER(0)?.text + " = ")

            if (ctx.for_statement()?.equality()?.calculation() != null) {
                sb.append(ctx.for_statement()?.equality()?.calculation()?.text)
            }
            if (ctx.for_statement()?.equality()?.VAR_VALUE() != null) {
                sb.append(ctx.for_statement()?.equality()?.VAR_VALUE()?.text)
            }
            if (ctx.for_statement()?.equality()?.IDENTIFIER(1) != null) {
                sb.append(ctx.for_statement()?.equality()?.IDENTIFIER(1)?.text)
            }
        }
        if (ctx?.for_statement()?.method() != null) {
            if (ctx?.for_statement()?.method()?.type_name() != null)
                sb.append(dok.typeNameContextToClassName(ctx?.for_statement()?.method()?.type_name()))

            sb.append(".")

            if (ctx?.for_statement()?.method()?.passed_args(0) != null) {
                sb.append(dok.stringToMethodName(ctx?.for_statement()?.method()?.IDENTIFIER(0)?.text!!, dok.classNameFromPackage(dok.typeNameContextToClassName(ctx?.for_statement()?.method()?.type_name()))))
                sb.append("(")
                sb.append(ctx?.for_statement()?.method()?.passed_args(0)?.text)
                sb.append(")")
            } else {
                sb.append(dok.stringToVarName(ctx?.for_statement()?.method()?.IDENTIFIER(0)?.text!!, dok.classNameFromPackage(dok.typeNameContextToClassName(ctx?.for_statement()?.method()?.type_name()))))
            }

            if (ctx?.for_statement()?.method()?.IDENTIFIER()?.size!! > 1) {
                for (i in 1 until ctx?.for_statement()?.method()?.IDENTIFIER()?.size!!) {
                    sb.append(".")
                    sb.append(ctx?.for_statement()?.method()?.IDENTIFIER(i)?.text)
                    if (ctx?.for_statement()?.method()?.passed_args(i) != null) {
                        sb.append(dok.stringToMethodName(ctx?.for_statement()?.method()?.IDENTIFIER(i)?.text!!, dok.classNameFromPackage(dok.typeNameContextToClassName(ctx?.for_statement()?.method()?.type_name()))))
                        sb.append("(")
                        sb.append(ctx?.for_statement()?.method()?.passed_args(i)?.text)
                        sb.append(")")
                    } else {
                        sb.append(dok.stringToVarName(ctx?.for_statement()?.method()?.IDENTIFIER(i)?.text!!, dok.classNameFromPackage(dok.typeNameContextToClassName(ctx?.for_statement()?.method()?.type_name()))))
                    }
                }
            }
        }

        sb.append(") {")
    }

    override fun exitDefine_for(ctx: ulleungParser.Define_forContext?) {
        sb.append("}")
    }

    override fun enterDefine_if(ctx: ulleungParser.Define_ifContext?) {
        sb.append("if(")
        sb.append(ctx?.booleans()?.text?.replace("이고", "&&")?.replace("이거나", "||")?.replace("참", "true")?.replace("거짓", "false"))
        sb.append(") {")
    }

    override fun exitDefine_if(ctx: ulleungParser.Define_ifContext?) {
        sb.append("}")
    }

}