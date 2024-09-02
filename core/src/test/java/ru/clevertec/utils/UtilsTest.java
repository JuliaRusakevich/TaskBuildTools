package ru.clevertec.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilsTest {


    @Test
    void isAllPositiveNumberTrue() {
        Utils utils = new Utils();
        assertTrue(utils.isAllPositiveNumbers("1", "2"));
    }

    @Test
    void isAllPositiveNumberFalse(){
        Utils utils = new Utils();
        assertFalse(utils.isAllPositiveNumbers("-1", "-2"));
    }

    @Test
    void isAllPositiveNumberCheckException() {
        Utils utils = new Utils();
        assertThrows(NumberFormatException.class, () -> utils.isAllPositiveNumbers("aaa"));
    }


}
