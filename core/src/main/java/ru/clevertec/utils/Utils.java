package ru.clevertec.utils;

import java.util.Arrays;

public class Utils {

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
