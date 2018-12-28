package ru.danilov.my;

import java.util.Scanner;

public class Main {
    private static Printer print = new Printer();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        userInputNumber(neededSystem());

    }

    private static boolean neededSystem(){
        String userInputSystem;

        print.systemInformation();
        while (true) {
            userInputSystem = scanner.nextLine();

            if (userInputSystem.equals("2")) {
                return false;
            } else if (userInputSystem.equals("10")) {
                return true;
            } else print.typeTwoOrTen();
        }
    }


    private static int userInputNumber(boolean tenDigitNumber){
        int input;

        print.typeYourNumber();
        while (true) {
            input = scanner.nextInt();

            if (tenDigitNumber && input >= -128 && input <= 127) {


            } else if (!tenDigitNumber && (input == 0 || input == 1)) {

            } else print.typeMistake();
        }
    }

    private static String fromTenToTwo(int userInput){
        StringBuilder finalNumber = new StringBuilder();

        if (userInput > 0) {
            finalNumber.append(0);
        } else finalNumber.append(1);

        if (userInput % )
    }
}
