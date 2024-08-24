package ru.clevertec.utils;

import ru.clevertec.utils.customAnnotation.Generated;

import java.util.Arrays;


public class Utils {

    @Generated
    public Utils() {
    }

    boolean isAllPositiveNumbers(String... str) throws NumberFormatException {

        StringUtils stringUtils = new StringUtils();

        for (String s : str) {

            if (!stringUtils.isPositiveNumber(s)) {
                System.out.println("All numbers are not positive : " + Arrays.toString(str));
                return false;
            }
        }
        System.out.println("All numbers are positive : " + Arrays.toString(str));
        return true;

    }
}
