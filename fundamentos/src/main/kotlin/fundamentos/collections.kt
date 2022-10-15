package fundamentos

fun main(){
    val lista = listOf(1, 2, 3) //não mutável
    val pares = lista.filter{ it %2 == 0 }.first() //it acessa o elemento da vez | pega só o 1º item

    println(pares)

    val listaSegunda = mutableListOf(10, 20, 30) //mutável
    listaSegunda.add(80)

    //set não aceita valores duplicados
    var setNumeros = setOf(1, 2, 3)

    //map estrutura de chave/valor
    var mapNomeIdade = mapOf("ana" to 20, "brenda" to 30)
    //mapNomeIdade.put("joana", 25)
}