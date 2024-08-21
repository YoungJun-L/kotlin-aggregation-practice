package org.example.aggregate.quiz4

fun answer1(): List<Transaction> {
    return transactions.filter { it.year == 2020 }
        .sortedWith(compareBy(Transaction::value).thenByDescending { it.trader.id })
}

fun answer2(): List<String> {
    return transactions.map { it.trader.city }.distinct().sorted()
}

fun answer3(): String {
    return transactions.map { it.trader.name }.distinct().sorted().joinToString()
}

fun answer4(): Boolean {
    return transactions.any { it.trader.city == "부산" }
}

fun answer5(): Pair<Int, Int> {
    val max = transactions.fold(0) { acc, transaction -> maxOf(acc, transaction.value) }
    val min = transactions.minOf { it.value }
    return max to min
}
