fun main() {
    println("Escreva o primeiro número");
    var x = readln().toInt();
    println("Escreva o segundo número");
    var y = readln().toInt();
    val divisor: Int = 13;
    var soma:Int = 0;
    if(!(divisor %2 == 0)) {
        for (i in x..y) {
            soma += i;
        }
        println("$soma");
    }
}