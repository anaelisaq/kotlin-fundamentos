package fundamentos

//val variável constante; var variável mutável
class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono) {
//utilizar classe dentro de classe
}

class Dono(var nome: String, var idade: Int){

}

fun main(){
    var carro = Carro("branco", 2022, Dono("ana", 22))
    println(carro.cor)
    carro.cor = "azul"
    println(carro.cor)

    println(carro.dono.nome)
}