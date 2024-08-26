package org.example.aggregation.quiz5

fun answer1(): Int {
    return words.sumOf { it.length }
}

fun answer2(): String {
    return words.maxByOrNull { it.length } ?: ""
}

fun answer3(): List<Int> {
    return generateSequence { (1..45).random() }.distinct().take(6).sorted().toList()
}

fun answer4(): List<Pair<Int, Int>> {
    return (1..6).flatMap { n1 -> (1..6).map { n2 -> n1 to n2 } }.filter { it.first + it.second == 6 }
}
