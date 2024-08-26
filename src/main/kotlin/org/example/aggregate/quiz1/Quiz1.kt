package org.example.aggregate.quiz1

// 이름, 취미, 자기소개
val data = listOf(
    listOf("김프로", "축구:농구:야구", "구기종목 좋아요"),
    listOf("정프로", "개발:당구:축구", "개발하는데 뛰긴 싫어"),
    listOf("앙몬드", "피아노", "죠르디가 좋아요 좋아좋아너무좋아"),
    listOf("죠르디", "스포츠댄스:개발", "개발하는 죠르디 좋아"),
    listOf("박프로", "골프:야구", "운동이 좋아요"),
    listOf("정프로", "개발:축구:농구", "개발도 좋고 운동도 좋아"),
)

/**
 * 취미별 인원수
 * @return {축구=3, 농구=2, ...}
 */
fun quiz1(): Map<String, Int> {
    TODO()
}

/**
 * 취미별 '정'씨 성을 갖는 인원수
 *
 * **값이 0인 항목도 결과에 포함되어야 함**
 * @return {축구=2, 농구=1, 야구=0, ...}
 */
fun quiz2(): Map<String, Int> {
    TODO()
}

/**
 * 자기소개에 포함된 **좋아** 단어의 총 개수
 * @return 8
 */
fun quiz3(): Int {
    TODO()
}

/**
 * 취미별 이름
 * @return {축구=`[`김프로, 정프로, 정프로`]`, 농구=`[`김프로, 정프로`]`, ...}
 */
fun quiz4(): Map<String, List<String>> {
    TODO()
}
