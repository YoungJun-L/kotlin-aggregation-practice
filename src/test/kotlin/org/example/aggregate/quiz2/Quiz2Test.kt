package org.example.aggregate.quiz2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Quiz2Test {
    @Test
    fun test1() {
        assertEquals(answer1(), quiz1())
    }

    @Test
    fun test2() {
        assertEquals(answer2(), quiz2())
    }
}
