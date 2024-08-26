package org.example.aggregation.quiz1

fun answer1(): Map<String, Int> {
    return data.flatMap { it[1].split(":") }.groupingBy { it }.eachCount()
}

fun answer2V1(): Map<String, Int> {
    return data
        .flatMap { line ->
            line[1].split(":").map { hobby -> hobby to line[0] }
        }
        .groupingBy { it.first }
        .fold(0) { acc, pair ->
            if (pair.second.startsWith("정")) {
                acc + 1
            } else {
                acc
            }
        }
}

fun answer2V2(): Map<String, Int> {
    return data
        .flatMap { line ->
            line[1].split(":").map { hobby -> hobby to line[0] }
        }
        .groupBy({ it.first }, { it.second })
        .mapValues { (_, names) -> names.count { it.startsWith("정") } }
}

fun answer3(): Int {
    return data.sumOf { "좋아".toRegex().findAll(it[2]).count() }
}

fun answer4(): Map<String, List<String>> {
    return data.flatMap { line -> line[1].split(":").map { hobby -> hobby to line[0] } }
        .groupBy({ it.first }, { it.second })
}
