package fundamentos

fun main(){
    //printa1a10()
    //printa10a1()
    //printaPar1a10()
    //printaRange(10, 30)
    whileMenorQue10()
    doWhileMenorQue10()
}

fun whileMenorQue10(){
    var x = 0
    while (x < 10){
        println(x)
        x++
    }
}

fun doWhileMenorQue10(){
    var x = 0
    do {
        println(x)
        x++
    } while (x < 10)
}

fun printa1a10(){
    for(numero in 1 .. 10){
        //.. para ordem crescente
        println(numero)
    }
}

fun printa10a1(){
    for(numero in 10 downTo 1){
        //downTo para ordem decrescente
        println(numero)
    }
}

fun printaPar1a10(){
    for(numero in 2 .. 10 step 2){
        //step para ir de 2 em 2
        println(numero)
    }
}

fun printaRange(inicio: Int, fim: Int){
    //range variável
    for(numero in inicio .. fim){
        println(numero)
    }
}