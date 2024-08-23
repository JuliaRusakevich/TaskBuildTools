package ru.clevertec.utils;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    static StringUtils stringUtils = null;

    @BeforeAll
    static public void setUp() {
        stringUtils = new StringUtils();
    }

    @ParameterizedTest
    @MethodSource("getValidationArguments")
    void isPositiveNumber(String str, boolean expectedResult) {
        boolean actualResult = stringUtils.isPositiveNumber(str);
        assertEquals(expectedResult, actualResult);
    }


    @ParameterizedTest
    @ValueSource(strings = {"^", "a", "-"})
    void isPositiveNumberCheckException(String str) {
        assertThrows(NumberFormatException.class, () -> stringUtils.isPositiveNumber(str));
    }

    static Stream<Arguments> getValidationArguments() {
        return Stream.of(
                Arguments.of("1", true),
                Arguments.of("3", true),
                Arguments.of("-10", false),
                Arguments.of("-9", false)
        );
    }
}