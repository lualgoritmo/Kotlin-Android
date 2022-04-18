fun main() {
    var soma = 0;
    for (n in 1..15 step 1) {
       soma += n;
        print(soma);
        println();
    }
    println("Resultado: $soma");
    /*var numero = 0;
    var soma = 0;
    while (numero < 16) {
        soma += numero;
        numero++
    }
    print("Soma : $soma");*/
}