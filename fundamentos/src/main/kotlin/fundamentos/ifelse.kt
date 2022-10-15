package fundamentos

fun main(){
    println(parOuImpar(2))
    println(parOuImpar(5))

    resultadoDaNota(10)
    resultadoDaNota(3)
    resultadoDaNota(6)
}

fun parOuImpar(numero: Int): String{
    return if(numero%2 == 0){
        "par"
    } else {
        "impar"
    }
}

fun resultadoDaNota(nota: Int){
    if(nota >= 6){
        println("aprovado")
    } else if (nota >= 4){
        println("recuperação")
    } else {
        println("reprovado")
    }
}