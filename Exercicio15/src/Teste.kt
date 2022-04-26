fun main() {

Funcionario()
}
fun Funcionario() {
    println("Quanfos funcionários")
    var nFuncionarios = readln().toInt()
    var funcionario = arrayOfNulls<String?>(nFuncionarios*2)
    var i: Int = 0
    while (i < funcionario.size) {
        println("Digite o nome")
        funcionario[i] = readln()
        i++
        println("Tempo de serviço")
        funcionario[i] = readln()
        i++
    }
    for (x in funcionario.indices) {
        println("${funcionario[x]}")
    }
}