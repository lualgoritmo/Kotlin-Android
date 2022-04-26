fun main() {
    println("Quantos produtos");
    val produtos = readln().toInt();
    val nomesProdutos = arrayOfNulls<String?>(produtos);
    val precoProdutos = arrayOfNulls<Double?>(produtos);
    inserirNomesEPrecos(nomesProdutos, precoProdutos);
    mostrarPrecoENomes(nomesProdutos,precoProdutos);

    //INSERINDO VALORES
    /*for (i in nomesProdutos.indices) {
        println("Digite o nome dos produtos $i");
        nomesProdutos[i] = readln();
    }
    for (i in precoProdutos.indices) {
        println("Digite os preços $i");
        precoProdutos[i] = readln().toDouble();
    }
    //MOSTRANDO VALORES
    for (nome in nomesProdutos) {
        println("Nome do Produto $nome");
    }
    for (p in precoProdutos) {
        if (p != null) {
            soma += p
        };
    }
    println("Valor total é:%.2f".format(soma));*/
}
fun inserirNomesEPrecos(nomesProdutos: Array<String?>, precoProdutos: Array<Double?>) {

    for (i in nomesProdutos.indices) {
        println("Digite o nome dos produtos ${i+1}");
        nomesProdutos[i] = readln();
    }
    println("-------------------------------------------------------------------");
    for (i in precoProdutos.indices) {
        println("Digite os preços $i");
        precoProdutos[i] = readln().toDouble();
    }

}
fun soma(n1:Int, n2:Int):Int {
    val resultado = n1 + n2
    return resultado
}
    fun mostrarPrecoENomes(nomesProdutos: Array<String?>, precoProdutos:Array<Double?>) {
        println("Mostrar Compra Realizada");
        println("-----------------------------------------");
        var soma: Double = 0.0;
        for (nome in nomesProdutos) {
            println("Nome do Produto $nome");
        }
        for (p in precoProdutos) {
            if (p != null) {
                soma += p
            };
        }
        println("O total é: %.2f".format(soma));
    }