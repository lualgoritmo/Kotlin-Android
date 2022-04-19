
fun main() {
    var peso: Double = 0.0;
    var altura: Double = 0.0;
    println("Digite o seu peso");
    peso = readln().toDouble();
    println("Digite a sua altura");
    altura = readln().toDouble();
    print(imc(peso,altura));
}
fun imc(peso:Double, altura:Double):Double {
    val imc = peso /(altura * altura);
    if(imc < 18.5){
        println("Abaixo do peso: %.2f".format(imc));
    }
    else if (imc in 18.5..24.90) {
        println("Peso normal: %.2f".format(imc));
    }
    else if (imc in 25.0..29.90) {
        println("SobrePeso: %.2f".format(imc));
    }
    else if (imc in 30.0..39.90) {
        println("Obesidade: %.2f".format(imc));
    }
    else {
        println("Obesidade grave: %.2f".format(imc));
    }
    return imc;
}