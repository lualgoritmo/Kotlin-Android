fun main() {
    println("Digite um número");
    var numero: Double = readln().toDouble();
    if(numero < 0){
        println("Negativo" + numero);
    }
    else if(numero > 0){
        println("Positivo" + numero);
    }
    else{
        println("Zero" + numero);
    }
}