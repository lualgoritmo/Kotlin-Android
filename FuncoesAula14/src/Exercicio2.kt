fun main() {
    println("Qual o seu nome?");
    val nome: String = readln();
    val bemVindo = bemVindo(nome);
    println("$bemVindo");
}
fun bemVindo(nome: String): String {
    print("Meu nome é: ");
    return nome;

}