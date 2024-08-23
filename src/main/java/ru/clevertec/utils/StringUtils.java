package ru.clevertec.utils;

public class StringUtils {
    public static void main(String[] args) {

        StringUtils stringUtils = new StringUtils();
        final String ERROR_INVALID_DATA = " - Invalid data. Please enter numbers.";


        for (String arg : args) {
            try {
                System.out.println(arg + " - " + stringUtils.isPositiveNumber(arg));
            } catch (NumberFormatException e) {
                System.out.println(arg + ERROR_INVALID_DATA);
            }

        }
    }

    boolean isPositiveNumber(String str) throws NumberFormatException {
        return Integer.parseInt(str) > 0;
    }

}
