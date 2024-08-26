# Kotlin Aggregation Practice

Kotlin의 집계 연산 및 Sequence 처리 능력을 연습하기 위한 문제들을 제공하며 함수형 프로그래밍 스타일을 익히는데 돕기 위해 제작하였습니다. 주어진
문제들은 `groupBy`, `map`, `reduce`, `flatMap` 등
Kotlin의 다양한 집계 연산을 활용하여 해결할 수 있습니다.

> [Stream API 문제 풀어보기](https://github.com/MangKyu/stream-quiz) 를 참고하여 허락 받고 제작하였습니다.

## 프로젝트 클론하기

이 리포지토리를 클론하여 로컬 환경에서 Kotlin 집계 연산 문제를 풀어볼 수 있습니다.

## 문제 구성

프로젝트는 문제 번호에 따라 패키지와 클래스가 구성되어 있습니다. 예를 들어, 1-1번 문제를 풀고 싶다면 `Quiz1.kt` 파일의 `quiz1` 메소드를 구현하면 됩니다.

```kotlin
/**
 * 취미별 인원수
 * @return {축구=3, 농구=2, ...}
 */
fun quiz1(): Map<String, Int> {
    TODO()
}
```

## 정답 확인하기

문제를 풀었다면 `Answer` 클래스를 참고하여 자신의 코드가 정답인지 확인할 수 있습니다. 또한, 자동화된 테스트를 통해 정답 여부를 쉽게 확인할 수 있습니다.

예를 들어, 1-1번 문제를 풀고 정답을 확인하고 싶다면 `Quiz1Test`의 `test1` 테스트를 실행하세요.

```kotlin
class Quiz1Test {
    @Test
    fun test1() {
        assertEquals(answer1(), quiz1())
    }
}
```

테스트를 성공적으로 통과했다면, 문제를 올바르게 해결한 것입니다😆

## 문제 목록

### Quiz 1

```kotlin
val data = listOf(
    listOf("김프로", "축구:농구:야구", "구기종목 좋아요"),
    listOf("정프로", "개발:당구:축구", "개발하는데 뛰긴 싫어"),
    listOf("앙몬드", "피아노", "죠르디가 좋아요 좋아좋아너무좋아"),
    listOf("죠르디", "스포츠댄스:개발", "개발하는 죠르디 좋아"),
    listOf("박프로", "골프:야구", "운동이 좋아요"),
    listOf("정프로", "개발:축구:농구", "개발도 좋고 운동도 좋아"),
)
```

1. 각 취미를 선호하는 인원이 몇 명인지 계산하라.
2. '정'씨 성을 갖는 사용자 중에서 각 취미를 선호하는 인원수를 계산하라.
3. 모든 사용자의 자기소개에서 '좋아'라는 단어가 몇 번 등장하는지 계산하라.
4. 각 취미를 선호하는 사람들의 이름 목록을 반환하라.

### Quiz 2

```kotlin
val words = listOf("TONY", "a", "hULK", "B", "america", "X", "nebula", "Korea")
```

1. 단어의 첫 글자를 기준으로 각 글자의 빈도수를 계산하라.
2. 길이가 2 이상인 단어들의 첫글자를 대문자로 변환 후 공백으로 구분하여 합친 문자열을 생성하라.

### Quiz 3

```kotlin
val numbers1 = listOf(1, 2, 3)
val numbers2 = listOf(3, 4)
```

1. 두 리스트의 모든 숫자 쌍을 반환하라.
2. 두 리스트의 모든 숫자 쌍의 곱 중 최댓값을 구하라.

### Quiz 4

```kotlin
data class Trader(val id: String, val name: String, val city: String)

data class Transaction(val trader: Trader, val year: Int, val value: Int)

val transactions = listOf(Transaction(Trader("1", "Kyu", "서울"), 2019, 30_000), ...)
```

1. 2020년에 일어난 거래 내역을 거래 값 기준으로 오름차순 정렬하되, 거래 값이 동일할 경우 ID 기준으로 내림차순 정렬하여 반환하라.
2. 거래 내역이 있는 거래자가 근무하는 도시 이름을 중복 없이 오름차순으로 정렬하여 반환하라.
3. 거래 내역이 있는 거래자의 이름을 중복 없이 오름차순으로 정렬 후, 이름들을 쉼표(",")로 구분된 문자열로 반환하라.
4. 거래 내역이 있는 거래자 중 부산에 거주하는 거래자가 있는지 확인하라.
5. 모든 거래 내역 중 거래 금액의 최댓값과 최솟값을 반환하라. 최댓값은 `fold`를 이용하여 계산하라.

### Quiz 5

```kotlin
val words = listOf("aaa", "bb", "c", "dddd")
```

1. 모든 단어의 길이를 더한 값을 반환하라.
2. 가장 길이가 긴 단어를 반환하라.
3. 임의의 로또 번호(1~45) 중 중복 없이 6개를 뽑아 오름차순으로 정렬하여 반환하라.
4. 두 주사위를 굴려 나온 눈의 합이 6인 경우를 나열하라.

### Quiz 6

```kotlin
data class Student(
    val name: String,
    val isMale: Boolean,
    val hak: Int,
    val ban: Int,
    val score: Int,
)

val students = listOf(Student("나자바", true, 1, 1, 100), ...)
```

1. 성별에 따라 150점 미만인 학생을 집계하여 반환하라.
2. 학년별로 반별 총점을 집계하라.

### Quiz 7

```kotlin
fun isPrime(num: Int): Boolean {
    return num == 2 || (2..ceil(sqrt(num.toDouble())).toInt()).none { num % it == 0 }
}
```

1. `Sequence`와 `isPrime()` 을 이용해서 10,000,000 이상의 수 중 첫 번째 소수를 반환하라.
2. `Sequence`와 `isPrime()` 을 이용해서 10,000,000 이상부터 나타나는 10개의 소수를 오름차순으로 나열하라.
3. `Sequence`를 이용해 50번째 피보나치 수를 계산하라.

## Contribute

개선하고 싶거나 문제를 추가하고 싶으시면 PR 부탁드립니다.
