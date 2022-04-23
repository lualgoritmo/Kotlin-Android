fun main() {
    println("Digite o valor do produto");
    val produto: Double =  readln().toDouble();
    println("Valor de venda do produto");
    var acrescimo:Double = readln().toDouble();
    val resultado = produto + (produto * acrescimo) / 100;
    println("Valor de venda: %.2f ".format(resultado));

}