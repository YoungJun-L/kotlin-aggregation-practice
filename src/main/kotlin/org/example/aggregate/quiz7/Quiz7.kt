package org.example.aggregate.quiz7

import kotlin.math.ceil
import kotlin.math.sqrt

fun isPrime(num: Int): Boolean {
    return num == 2 || (2..ceil(sqrt(num.toDouble())).toInt()).none { num % it == 0 }
}

/**
 * [isPrime] 을 이용해서 10,000,000 이상의 수 중 첫번째 소수 반환
 * @return 10000019
 */
fun quiz1(): Int {
    TODO()
}

/**
 * [isPrime] 을 이용해서 10,000,000 이상부터 나타나는 10개의 소수를 오름차순으로 나열
 * @return `[`10000019, 10000079, 10000103, ...`]`
 */
fun quiz2(): List<Int> {
    TODO()
}

/** 50번째 피보나치 수(F50)
 *
 * 0번째(F0): 0, 1번째(F1): 1
 * @return 12586269025
 */
fun quiz3(): Long {
    TODO()
}
