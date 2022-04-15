import com.sun.jdi.connect.Connector.StringArgument

fun main() {
    var diaSemana = arrayOf("Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado");
    var semana = diaSemana;
    for (i in semana.indices){
        var dia: Int = i + 1;
       println("Dia da ${semana[i]}, Dia: $dia");
    }
}