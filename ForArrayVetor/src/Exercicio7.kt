import kotlin.math.sign

fun main() {
    println("Quantos alunos na classe?");
    var quantidadeAlunos = readln().toInt();
    var alunos = IntArray(quantidadeAlunos);
    var soma = 0;
    var media = 0;
    for (i in alunos.indices){
       println("Digite a nota ${i + 1}");
        alunos[i] = readln().toInt();
        soma += alunos[i];
        media = soma/alunos.size;
    }
    println("-------------------------------------------------------");

    println("A média das classe é: $media");
}


