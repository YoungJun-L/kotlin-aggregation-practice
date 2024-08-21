package org.example.aggregate.quiz6

val students = listOf(
    Student("나자바", true, 1, 1, 100),
    Student("김지미", false, 1, 1, 250),
    Student("김자바", true, 1, 1, 200),
    Student("이지미", false, 1, 2, 150),
    Student("남자바", true, 1, 2, 170),
    Student("안지미", false, 1, 2, 180),
    Student("황지미", false, 1, 3, 100),
    Student("강지미", false, 1, 3, 150),
    Student("이자바", true, 1, 3, 200),
    Student("나자바", true, 2, 1, 300),
    Student("김지미", false, 2, 1, 250),
    Student("김자바", true, 2, 1, 200),
    Student("이지미", false, 2, 2, 150),
    Student("남자바", true, 2, 2, 200),
    Student("안지미", false, 2, 2, 150),
    Student("황지미", false, 2, 3, 100),
    Student("강지미", false, 2, 3, 150),
    Student("이자바", true, 2, 3, 200)
)

/**
 * isMale 값에 따른 150점 미만의 학생 집계
 * @return {true=`[`Student(name=나자바, isMale=true, hak=1, ban=1, score=100), ...`]`,
 * false=`[`Student(name=황지미, isMale=false, hak=1, ban=3, score=100), ...`]`}
 */
fun quiz1(): Map<Boolean, List<Student>> {
    return emptyMap()
}

/**
 * 학년별로 반별 총점 집계
 * @return {1={1=550, 2=500, 3=450}, 2={1=750, 2=500, 3=450}}
 */
fun quiz2(): Map<Int, Map<Int, Int>> {
    return emptyMap()
}
