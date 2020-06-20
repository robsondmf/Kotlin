fun main() {
    println(mostraNome("Robson"))
    val num1 = 10
    val num2 = 20
    val num3 = 30
    val num4 = 40

    mostrarNum(num1)
    mostrarNum2(num2)
    mostarNum3(num3)
    mostrarNum4(num4)
    soma(num1, num2,num3)
}

fun mostrarNum4(num4: Int) {
    println(num4)
}

//método 3
fun mostarNum3(num3: Int) {
    println(num3)

}

//método para mostar numero1
fun mostrarNum(num1: Int) {
    println(num1)
}

//método para mostar numero2
fun mostrarNum2(num2: Int) {
    println(num2)
}

fun mostraNome(nome: String): String {

    val nome1 = nome

    return nome1
    //    println( "O nome informando foi :${nome}")
}


fun soma(num1: Int, num2: Int, num3:Int) {
    println(num1 + num2+num3)
}
