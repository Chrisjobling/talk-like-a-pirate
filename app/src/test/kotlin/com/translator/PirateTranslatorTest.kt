package com.translator

import kotlin.test.Test
import kotlin.test.assertEquals

class PirateTranslatorTest {
    @Test fun testPirateTranslator() {

        val classUnderTest : PirateTranslator = DefaultPirateTranslator()

        assertEquals(expected = "Ahoy!, I am Captain Jack Sparrow", classUnderTest.translate("Hello, I am Captain Jack Sparrow"))
        assertEquals(expected = "Aye", classUnderTest.translate("Yes"))
        assertEquals(expected = "AYE AYE!", classUnderTest.translate("Captain!"))

    }
}