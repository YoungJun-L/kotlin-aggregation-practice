package org.example.aggregation.quiz3

fun answer1(): List<Pair<Int, Int>> {
    return numbers1.flatMap { n1 -> numbers2.map { n2 -> n1 to n2 } }
}

fun answer2V1(): Int {
    return numbers1.maxOf { n1 -> numbers2.maxOf { n2 -> n1 * n2 } }
}

fun answer2V2(): Int {
    return numbers1.flatMap { n1 -> numbers2.map { n2 -> n1 * n2 } }.max()
}
