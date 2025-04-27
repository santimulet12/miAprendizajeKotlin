package org.example

class Programador(val name: String,
                  val age:Int,
                  var languages: List<Languages>,
                  val friends: List<Programador>? = null) { // Los amigos que puede tener el Programador pueden ser de tipo Programador, o null ("?" nullSafety)

    enum class Languages{ // Aqui estamos tipando los elementos que puede contener la lista de lenguajes de la clase
        PYTHON,
        JAVASCRIPT,
        JAVA,
        C,
        PHP,
        SWIFT,
        TYPESCRIPT,
        GO,
        RUBY,
        KOTLIN,
        OBJECTIVE_C,
        MATLAB,
        PERL,
        SCALA,
        DART,
        RUST,
        LUA,
        HTML,
        CSS

    }

    fun code(){ //  Metodo, acciones que puede realizar nuestro objeto
        languages.forEach {
            println("Estoy programando en $it")
        }
    }
}