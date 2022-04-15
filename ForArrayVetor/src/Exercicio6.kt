fun main() {
    println("Nome da Banda");
    var nomeBanda = readln();
    println("Quantas músicas gosta?");
    var quantidadeMusicas = readln().toInt();
    var musicas = arrayOfNulls<String>(quantidadeMusicas);
    for (i:Int in musicas.indices){
        println("Qual o nome da músicas ${i + 1}");
        musicas[i] = readln();
    }
    println("-----------------------------------------------");
    println("Nome da Banda: $nomeBanda");
    for (x in musicas.indices){
        println("Nome da música ${x + 1}");
        println("${musicas[x]}");
    }
}