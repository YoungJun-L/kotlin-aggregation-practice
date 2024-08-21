package org.example.aggregate.quiz3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Quiz3Test {
    @Test
    fun test1() {
        assertEquals(answer1(), quiz1())
    }

    @Test
    fun test2() {
        assertEquals(answer2V1(), quiz2())
    }
}
