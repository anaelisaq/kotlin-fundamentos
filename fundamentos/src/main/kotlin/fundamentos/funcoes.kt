package fundamentos

//como declarar funções
//fun nome(parametros):retorno [por padrão retornam, unit/vazio]{}
fun main() {
    println("hello world")
    var nome  = retornaNome()
    println(nome)

    dizOi(retornaNome(), 30)
}

fun retornaNome(): String{
    return "qualquer nome"
}

fun dizOi(nome: String, idade: Int){
    println("oi ${nome} parabéns pelos seus ${idade}")
}