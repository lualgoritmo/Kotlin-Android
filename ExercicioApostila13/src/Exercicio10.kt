fun main() {
    var num = arrayOfNulls<Int>(15)
    var media = 0;
    var soma:Int = 0;
    println("Digite 15 números");
    for (i in num) {
        num += readln().toInt();
        soma += num;
    }
    print("Num $soma");
}