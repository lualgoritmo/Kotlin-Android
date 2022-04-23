fun main() {
    println("Qual a cotação do dólar?");
    val cotacao: Double = readln().toDouble();
    println("Quanto tem em Dólares?");
    val quantia: Double = readln().toDouble();
    var reais = quantia * cotacao;
    println("Valor em reais é: %.2f".format(reais));
}