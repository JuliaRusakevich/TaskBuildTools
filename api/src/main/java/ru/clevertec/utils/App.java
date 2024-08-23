package ru.clevertec.utils;

public class App {

    public static void main(String[] args) {

        Utils utils = new Utils();
        try {
            utils.isAllPositiveNumbers(args);
        } catch (NumberFormatException e) {
            System.out.println("Invalid data. Please try again.");
        }


    }
}
