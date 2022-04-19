fun main() {
    areaRetangulo();
}

fun areaRetangulo() {
    println("Qual a base?");
    var base:Double = readln().toDouble();
    println("Qual a altura?");
    val altura:Double = readln().toDouble();
    var area:Double = base * altura;
    println("A área é: $area");
}