package fundamentos

fun main (){
    var nome =  "a"//mutável
    val idade = 30 //imutável

    nome = "b"
}

class variaveis{
    lateinit var teste:String //avisando que vai atribuir valor depois

    fun iniciaVariaveis(){
        teste = "teste"
    }
}