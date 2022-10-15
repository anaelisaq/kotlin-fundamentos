package fundamentos

fun returnaNumeroPorExtenso(numero: Int): String{
    if(numero == 5){
        return "cinco"
    } else if (numero == 7){
        return "sete"
    }
    return "numero não mapeado"
}

fun main(){
    println(returnaNumeroPorExtenso(7))
    println(returnaNumeroPorExtenso(5))
    println(returnaNumeroPorExtenso(12))
}