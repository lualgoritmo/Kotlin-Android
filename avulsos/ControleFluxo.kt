fun idade(idade: Int){
    if (idade >= 18) {
        println("Pode entrar");
    }
    else {
        println("Não pode, menor");
    }
}
fun idade1(idade: Int): Boolean {
    return idade >= 18;
}
fun main() {
    idade(idade = 10);
    print("-----------------");
    println();
    idade(idade = 18);
    print("-----------------");
    println();
    idade(idade = 19);
    print("Abaixo Boolean");
    println();
    idade1(idade = 10);
    print("Abaixo Boolean");
    println();
    idade(idade = 18);
    print("-----------------");
    println();
}