fun main() {
    var controle: Int = 10;
    do {
        if(controle <= 100){
            println("Do While: $controle");
            controle++;
        }
    }while (true);
    /*while (controle <= 100){
        if(controle == 50){
           println("Parou");
            break;
        }
        else{
            println(controle);
        }
        controle ++;
    }*/
}