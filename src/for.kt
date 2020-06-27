fun main() {

    val numero: Int = 10


    for1(numero)
    for2(numero)
    for3(numero)
    for4(numero)

}

fun for4(numero: Int) {
    // for de 0 até 10
    for (x in 0..10)
        println("O valor atual é ${x} " )
}

fun for3(numero: Int) {
    //for de 0 até 9
    for (x in 0 until numero)
        println("O valor atual é ${x}")
}


fun for2(numero: Int) {
    //for de 0 até 8
    for (x in 0 until numero step 2)
        println("O valor atual é ${x}")
}

fun for1(numero: Int) {
    //for de 10 até 0
    for (x in numero downTo 0 step 2)
        println("O valor atual é ${x}")
}
