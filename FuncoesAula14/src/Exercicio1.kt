fun main() {
    println("Digite o número limite da soma;");
    var num: Double = readln().toDouble();
    var result = somaToria(num);
    println("Resultado chamando função: $result");
}
fun somaToria(num: Double): Double {
    var soma: Double = 0.0;
    for (n in 1..num.toInt()){
        soma += n;
    }
    return soma;
}