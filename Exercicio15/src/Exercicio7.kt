import java.util.SortedMap
fun main() {
   quantidadeAlunosTurmas()
}

fun quantidadeAlunosTurmas() {
    println("Quantidade de turmas?")
    var turmaQuantidade = readln().toInt()
    var turmas = IntArray(turmaQuantidade)

        for (i in turmas.indices) {
            println("Informe a quantidade de aluno da ${i + 1} Turma")
            turmas[i] = readln().toInt()
        }

        mediaTurma(turmaQuantidade,turmas)
}
fun mediaTurma(quantidadeTurmas:Int, turma:IntArray) {
    var nota = DoubleArray(quantidadeTurmas)

    for (i in nota.indices) {
        var soma:Double = 0.0
        var media:Double = 0.0
        for (x in 1..turma[i]) {
            println("Digite a média da turma ${i + 1}, aluno ${x}")
            var notaMedia = readln().toDouble()
            soma += notaMedia
            media = soma / turma[i]
        }
        nota[i] = media
    }
    println("--------------------Resultado Média-------------------------")

    for (i in nota.indices) {
        println("Turmas: ${i + 1}")
        println("Média da Turma: ${nota[i]}")
    }
}