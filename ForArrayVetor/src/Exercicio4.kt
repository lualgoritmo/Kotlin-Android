fun main() {
   var numeroInserido = IntArray(5);
   var resultado: Int = 0;
    for (i in numeroInserido){
        println("Digite os números");
        println();
        numeroInserido[i] = readln().toInt();
        resultado = numeroInserido[i];
        if(numeroInserido[i] %2 == 0){
            println();
            println("Número par: $resultado");
        }
        else{
            println();
            println("Número impar: $resultado");
        }
    }
}