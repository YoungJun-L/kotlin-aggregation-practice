package org.example.aggregation.quiz5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Quiz5Test {
    @Test
    fun test1() {
        assertEquals(answer1(), quiz1())
    }

    @Test
    fun test2() {
        assertEquals(answer2(), quiz2())
    }

    @Test
    fun test3() {
        val results = quiz3()
        assertEquals(6, results.distinct().size)
        assertTrue { results.all { it in 1..45 } }
    }

    @Test
    fun test4() {
        assertEquals(answer4().size, quiz4().size)
        assertTrue(answer4().all { quiz4().contains(it) })
    }
}
