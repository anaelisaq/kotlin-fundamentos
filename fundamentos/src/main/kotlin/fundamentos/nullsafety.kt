package fundamentos

fun main(){
    //possibilidade do valor ser nulo
    var nome: String? = "ana"
    nome = null
    //evita verificações/validações
    println(nome?.length)

    //elvis operator ?: > se for nulo, faça isso

}