package org.example.aggregate.quiz5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

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
        assertEquals(answer3(), quiz3())
    }

    @Test
    fun test4() {
        assertEquals(answer4(), quiz4())
    }
}
