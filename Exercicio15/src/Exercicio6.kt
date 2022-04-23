fun main() {
    tabuada();
}
fun tabuada() {
        for (i in 1..10) {
           for (x in 1..10) {
               var resultado = x * i
               println(" $x x $i: $resultado")
           }
        }
    println("--------------------------")
}