package function

fun main() {
    val str:Char? = '2'
    println(str?.let { decimalDigitValue(it) })
}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Вне диапазона")
    return c.toInt() - '2'.toInt() // Явные преобразования в число
}

fun max(a:Int, b:Int) = if (a > b) println(a) else println(b)