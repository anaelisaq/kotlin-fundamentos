package fundamentos

fun main(){
    val x = 5
    //funciona como switch/case
    when(x){
        5 -> println("x == 5")
        //pode agrupar ações
        3, 7, 9 -> println("numero impar")
        8 -> println("x == 8")
        //informar range
        in 12..20 -> println("maiores que 10 e menores que 21")
        !in 21..30 -> println("não está entre 21-30")
        else -> println("numero não mapeado")
    }
}