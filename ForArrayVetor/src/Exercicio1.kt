fun main() {
    var valor = IntArray(5);
    var numeros = valor;
    var soma:Int = 0;
    for(i in numeros){
        println("Digite os 5 números para a soma");
        numeros[i] = readln().toInt();
        soma += numeros[i];
    }
    println("Total da soma: $soma");
}