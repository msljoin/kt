package collections

import kotlin.random.Random

fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) { it.length <= maxLength }
    // throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}

fun main() {
//    val words = "A long time ago in a galaxy far far away".split(" ")
//    val shortWords = mutableListOf<String>()
//    words.getShortWordsTo(shortWords, 3)
//    println(shortWords)
    lists()
}

fun lists() {
    val list: MutableList<Int> = mutableListOf()
    var i: Int = 0
    // fill list
    while (i < 5) {
        list.add(Random.nextInt(0, 10))
        i++
    }
    println("list $list")
    // sort val from s to h
    list.sort()
    println("list after sort() $list")
    // remove first
    list.removeAt(0)
    // remove last
    list.removeAt(list.size-1)
    println("new $list")
}