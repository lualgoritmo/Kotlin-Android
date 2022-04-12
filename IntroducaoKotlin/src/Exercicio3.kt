fun main() {

    println("Digite o multiplicador")
    val num: Int = readln().toInt();
    println("Digite até quanto")
    var n: Int = readln().toInt();
    for (i in 0..n step num) {
        if(i % num == 0){
            println("\n Multiplicador: $num\n Resultado: $i")
        }
    }
}



