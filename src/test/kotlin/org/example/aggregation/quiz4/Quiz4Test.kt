package org.example.aggregation.quiz4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Quiz4Test {
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
        assertEquals(answer3(), quiz3())
    }

    @Test
    fun test4() {
        assertEquals(answer4(), quiz4())
    }

    @Test
    fun test5() {
        assertEquals(answer5(), quiz5())
    }
}
