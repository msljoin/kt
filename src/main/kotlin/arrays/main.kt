package arrays

fun main() {
//    listOf(1, 2, 3, 4, 5).forEach {
//        if (it == 3) return // non-local return directly to the caller of foo()
//        print(it)
//    }
//    println("this point is unreachable")

    val numbs = arrayOf(1, 2, 3, 4, 5)
    println(numbs.contentToString())

    val numbs2 = (3..12).toList().toTypedArray()
    println(numbs2.contentToString())

    val numbs3 = IntArray(5) { i -> i * 2 + 3 }
    println(numbs3.contentToString())

    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    print(" done with explicit label")
}

