package org.example.aggregate.quiz7

fun answer1(): Int {
    return generateSequence(10_000_000) { it + 1 }.first(::isPrime)
}

fun answer2(): List<Int> {
    return generateSequence(10_000_000) { it + 1 }.filter(::isPrime).take(10).toList()
}

fun answer3(): Long {
    return generateSequence(0L to 1L) { (it.first + it.second) to it.first }.take(51).last().first
}
