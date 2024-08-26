package org.example.aggregation.quiz3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Quiz3Test {
    @Test
    fun test1() {
        assertEquals(answer1().size, quiz1().size)
        assertTrue(answer1().all { quiz1().contains(it) })
    }

    @Test
    fun test2() {
        assertEquals(answer2V1(), quiz2())
    }
}
