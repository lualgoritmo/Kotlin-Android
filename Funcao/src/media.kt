fun main() {
    media(10f,5f,8f,10f);
    media(10f,10f,10f,10f);
    media(5f,10f,2.5f,10f);
    media("","Luana", 1,2,3,4,);
}
fun <T> media(vararg valores:T){
    for(valor in valores){
        println(valor);
    }
}
/*fun media(vararg notas:Float){
    if(notas.isNotEmpty()){
        var soma = 0f;
        for(nota in notas){
            soma += nota;
        }
       println("A média é: ${soma/notas.size}");
    }
}*/