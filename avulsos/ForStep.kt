fun main() {
    var str: String = "Luana Gostosa";
    for (i in str) {
        println("Com o for in: $i");
    }
    for (i in 0..100 step 7) {
        println("Com Step: $i");
    }
    for (i in 0..100 step 5) {
        if (i <= 40) {
            println("For múltiplicado por 5 até 40: $i");
        }
    }
    //DO MAIOR PARA O MENOR DOWNTOO
    for(j in 100 downTo 0){
        println("De 100 para 0: $j");
    }
}
