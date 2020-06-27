fun main() {
    val nome = "Robson"
    var num:Int = 10
    mostarNome(nome)
    lacoWhile(num)
}

fun lacoWhile(x:Int) {

    for (i in 0 until x){
        println(i)
    }
}

//método para mostrar o nome
fun mostarNome(nome: String) {
    println("O nome do usuario é ${nome}")
}
