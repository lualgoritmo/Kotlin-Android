fun main() {
    println("Digite um número");
    var n:Int = readln().toInt();
    var numero = IntArray(9);
    for (i in n..numero.size) {
        var soma = i * 2;
        println(soma);
    }
}