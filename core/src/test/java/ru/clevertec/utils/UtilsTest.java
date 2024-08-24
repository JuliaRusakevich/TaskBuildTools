package ru.clevertec.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isAllPositiveNumber() {
        Utils utils = new Utils();
        assertTrue(utils.isAllPositiveNumbers("1", "2"));
        assertFalse(utils.isAllPositiveNumbers("-1", "-2"));
        assertFalse(utils.isAllPositiveNumbers("1", "-2", "3"));
    }

    @Test
    void isAllPositiveNumberCheckException() {
        Utils utils = new Utils();
        assertThrows(NumberFormatException.class, () -> utils.isAllPositiveNumbers("aaa"));
    }


}