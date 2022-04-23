fun main() {
    println("Digite os dois números");
    var n = readln().toInt();
    var numeros = IntArray(n);
    var soma = 0;
    var diminuir = 0;
    var multiplicar = 0;
    var dividir = 0;

    for (i in numeros){
       println("Digite os números");
        numeros[i] = readln().toInt();
        soma += numeros[i];
        diminuir -= numeros[i];
        multiplicar *= numeros[i];
        dividir /= numeros[i];
    }
    println("A soma é: $soma");
    println("A diminuição é: $diminuir");
    println("A multiplicação é: $multiplicar");
    println("A Divisão é: $dividir");
}
