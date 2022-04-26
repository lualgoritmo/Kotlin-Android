import Teste.Primeira
import com.sun.security.auth.NTDomainPrincipal

fun main() {
    val nome: Primeira = Primeira()
    nome.nome()
    cadastrarFuncionario()
}

fun cadastrarFuncionario() {
    println("Quantos funcionários")
    var nFuncionarios = readln().toInt()
    var funcionario = arrayOfNulls<String?>(nFuncionarios)
    var nTempoServico = IntArray(nFuncionarios)
    var ferias = 12

    for (i in funcionario.indices) {
        println("Digite o nome")
        funcionario[i] = readln()
        println("Tempo de Serviço")
        nTempoServico[i] = readln().toInt()
    }

    for (x in funcionario.indices) {
       println("Nome: ${funcionario[x]}")
       println("Tempo de serviço: ${nTempoServico[x]}")
        if (nTempoServico[x] == ferias) {
            println("Tem direito a férias!")
        }
        else if (nTempoServico[x] < ferias) {
            var meses = ferias - nTempoServico[x]
            println("Não tem direito a férias")
            println("Faltam $meses para as férias")
        }
    }
}


