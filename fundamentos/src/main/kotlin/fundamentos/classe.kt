package fundamentos
class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa, Nome: ${nome} Idade: ${idade}"
    } //ou pode utilizar o data class para retornar os valores
}

fun main() {
    var ana = Pessoa("Ana", 26)
    println(ana)
}