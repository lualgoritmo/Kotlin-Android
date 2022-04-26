fun main() {
    println("Quantos animados para cadastrar?");
    var animais = readln().toInt();
    var tipoAnimal = arrayOfNulls<String?>(animais);
    quantidadeAnimais(tipoAnimal);
}
fun quantidadeAnimais(animal:Array<String?>) {
    var cachorro = 0;
    var gato = 0;
    println("Digite se é Gato(a) ou Cachorro(a)");
    for (i in animal.indices) {
        animal[i] = readln();
    }
    println("Quantidade de animais cadastrados: ${animal.size}");
    println("---------------------------------------------------------");
    for (i in animal) {
       if (animal.contains("Cachorro") && i == "Cachorro") {
           cachorro += 1;
       }
       else if (animal.contains("Gato") && i == "Gato") {
           gato += 1;
       }
       else {
           println("Animal não cadastrado ou não existe!");
       }
    }
    println("Cachorros cadastrados: $cachorro");
    println("Gatos cadastrados: $gato");
}