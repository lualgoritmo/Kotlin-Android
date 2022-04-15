fun chama(a: Int, b: Int, c:Int){
    println();
    println("Função chama");
    println("Soma: ${a + b + c}");
}
fun nome(nome:String){
    println();
    println("Função nome");
    println("Nome: $nome");
}

fun funRetorno(nome: String): String{
    println();
    println("Função com retorno");
    return "NomeF: $nome"
}
fun main() {
   var a = 10;
    var b = 20;
    var c = 20;
    chama(a, b, c);
    nome("Luana Gostosa");
    println("----------------------------------------");
    println(funRetorno("Luana Gostosa"));
}