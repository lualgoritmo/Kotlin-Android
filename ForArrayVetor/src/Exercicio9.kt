import kotlin.system.exitProcess

fun main() {
    var operacao = "";
    var n1: Double;
    var n2:Double;
    while (true){
        println();
        println("Qual Operação");
        print("Soma: + ");
        println("Subtração: -");
        println("Multiplicação: *");
        println("Divisão: /");
        println("Digite x para sair");
        println();
        operacao = readln();
        if (operacao == "+"){
            println("Digite os valores de N1 e N2");
            n1 = readln().toDouble();
            n2 = readln().toDouble();
            var soma = n1 + n2;
            println("A soma: $soma");
        }
        else if (operacao == "-"){
            println("Digite os valores de N1 e N2");
            n1 = readln().toDouble();
            n2 = readln().toDouble();
            var subtracao = n1 - n2;
            println("A subtração: $subtracao");
            println();
        }
        else if (operacao == "/"){
            println("Digite os valores de N1 e N2");
            n1 = readln().toDouble();
            n2 = readln().toDouble();
            var divisao = n1 / n2;
            println("A Divisão: $divisao");
            println();
        }
        else if (operacao == "*"){
            println("Digite os valores de N1 e N2");
            n1 = readln().toDouble();
            n2 = readln().toDouble();
            var multiplicacao = n1 * n2;
            println("A Multiplicação: $multiplicacao");
            println();
        }
        else if (operacao == "x"){
            exitProcess(0);
        }
        else{
            println("Operação Inválida");
        }
    }
}