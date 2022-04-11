fun main() {
    println("Digite os valores de Y e X");
    var y:Int = readln().toInt();
    var x:Int = readln().toInt();
    trocaValores(y, x);
}

fun trocaValores(n1:Int, n2:Int){
    var num1: Int = n1;
    var num2: Int = n2;
    println("Números sem trocar: $num1, $num2");
    if(num1 != num2){
        num1 = n2;
        num2 = n1;
        println("Números torcados: $num1, $num2");
    }
    else{
        println("São números iguais");
    }
}