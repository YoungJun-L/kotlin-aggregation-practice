package org.example.aggregate.quiz2

fun answer1(): Map<Char, Int> {
    return words.groupingBy(String::first).eachCount()
}

fun answer2(): String {
    return words.filter { it.length >= 2 }.joinToString(" ") { it[0].uppercase() }
}
