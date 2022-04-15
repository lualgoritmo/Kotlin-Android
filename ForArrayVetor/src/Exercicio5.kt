fun main() {
    println("Quantidade de Itens");
    var quantidadeDeItens = readln().toInt();
    var produtosEscolhidos = arrayOfNulls<String>(quantidadeDeItens);
    for (i:Int in produtosEscolhidos.indices){
        println("Digite os produtos de interesse");
        produtosEscolhidos[i] = readln();
    }
    println("----------------------------------------------------");
    println("Lista de Compras:");
    for(x in produtosEscolhidos.indices){
        println("Itens: ${x + 1}, ${produtosEscolhidos[x]}");
    }
}

