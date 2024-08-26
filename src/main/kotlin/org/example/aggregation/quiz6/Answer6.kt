package org.example.aggregation.quiz6

fun answer1(): Map<Boolean, List<Student>> {
    return students.groupBy(Student::isMale).mapValues { (_, students) -> students.filter { it.score < 150 } }
}

fun answer2(): Map<Int, Map<Int, Int>> {
    return students
        .groupBy(Student::hak)
        .mapValues { (_, students) ->
            students
                .groupingBy(Student::ban)
                .fold(0) { acc, student ->
                    acc + student.score
                }
        }
}
