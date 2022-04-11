fun main() {
    println("Qual a temperatura?");
    var temperatura: Int = readln().toInt();
    if(temperatura <= 18){
        println("Clima frio: $temperatura, graús");
    }
    else if(temperatura >= 19 && temperatura <= 23){
        println("Temperatura agradável: $temperatura, graús");
    }
    else if(temperatura >= 24 && temperatura <= 35){
        println("Temperatura quente: $temperatura, graús");
    }
    else{
        println("Temperatura muito quente! $temperatura,graús");
    }
}