package org.example.aggregate.quiz4

val traderA = Trader("1", "Kyu", "서울")
val traderB = Trader("2", "Ming", "경기")
val traderC = Trader("3", "Hyuk", "서울")
val traderD = Trader("4", "Hwan", "부산")
val traderE = Trader("5", "Hwan", "부산")
val traderG = Trader("6", "Hyuk", "서울")

val transactions = listOf(
    Transaction(traderA, 2019, 30_000),
    Transaction(traderA, 2020, 12_000),
    Transaction(traderB, 2020, 40_000),
    Transaction(traderB, 2020, 10_000),
    Transaction(traderC, 2019, 5_900),
    Transaction(traderD, 2020, 10_000),
    Transaction(traderE, 2022, 4_500),
    Transaction(traderG, 2021, 50_000),
    Transaction(traderG, 2020, 10_000),
)

/**
 * 2020년에 일어난 거래 내역을 거래값을 기준으로 오름차순, 거래값이 같으면 id 를 기준으로 내림차순으로 정렬하여 나열
 * @return `[`Transaction(trader=Trader(id=6, name=Hyuk, city=서울), year=2020, value=10000),
 * Transaction(trader=Trader(id=4, name=Hwan, city=부산), year=2020, value=10000),
 *
 * Transaction(trader=Trader(id=2, name=Ming, city=경기), year=2020, value=10000), ...`]`
 */
fun quiz1(): List<Transaction> {
    return emptyList()
}

/**
 * 거래 내역이 있는 거래자가 근무하는 도시의 이름을 중복없이 오름차순으로 정렬하여 나열
 * @return `[`경기, 부산, 서울`]`
 */
fun quiz2(): List<String> {
    return emptyList()
}

/**
 * 거래 내역이 있는 거래자의 이름을 중복없이 오름차순으로 정렬 후 구분자(",")로 구분된 문자열로 반환
 * @return Hwan, Hyuk, Kyu, Ming
 */
fun quiz3(): String {
    return ""
}

/**
 * 거래 내역이 있는 거래자 중 부산 거주자의 유무
 * @return true
 */
fun quiz4(): Boolean {
    return false
}

/**
 * 모든 거래 내역 중 거래 금액의 최댓값, 최솟값을 반환
 *
 * 단, 최댓값은 [Iterable.fold] 를 이용
 * @return (50000, 4500)
 */
fun quiz5(): Pair<Int, Int> {
    val max = 0
    val min = 0
    return max to min
}
