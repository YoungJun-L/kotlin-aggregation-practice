package org.example.aggregation.quiz1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Quiz1Test {
    @Test
    fun test1() {
        assertEquals(answer1(), quiz1())
    }

    @Test
    fun test2() {
        assertEquals(answer2V1(), quiz2())
    }

    @Test
    fun test3() {
        assertEquals(answer3(), quiz3())
    }

    @Test
    fun test4() {
        val results = quiz4()
        assertEquals(answer4().keys, results.keys)
        assertTrue { answer4().all { (key, value) -> (results[key] ?: emptyList()).containsAll(value) } }
    }
}
