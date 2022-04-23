import java.util.SortedMap

fun main() {
   quantidadeAlunosTurmas()
}
fun quantidadeTurmas(): Array<Int?> {
    println("Quantidade de Turmas")
    var turmasNumero = readln().toInt()
    var numeroTurmas = arrayOfNulls<Int?>(turmasNumero);

    for (n in numeroTurmas.indices) {
        if (numeroTurmas[n] != null) {
            print("Número de Turmas $n")
        }
    }
    return numeroTurmas
}
fun quantidadeAlunosTurmas() {
    var turmaQuantidade = quantidadeTurmas()
    println("Número de alunos por turma?")
    var nAlunos = readln().toInt()
    val alunos = DoubleArray(nAlunos)
    var somaMediaAlunos = 0.0

    for (x in turmaQuantidade.indices) {
        println("Turmas ${x + 1}")
        for (aluno in alunos.indices) {
            println("Digite à média do aluno ${aluno + 1}");
            alunos[aluno] = readln().toDouble()
        }
    }
    println("--------------------Resultado Média-------------------------")

        for (i in alunos.indices) {
            println("Turma ${i + 1}")
            somaMediaAlunos += alunos[i]
            println("Média: %.2f: ".format(somaMediaAlunos))
        }
}