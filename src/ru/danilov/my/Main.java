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


    private static void userInputNumber(boolean tenDigitNumber){
        int userInput;

        print.typeYourNumber();
        while (true) {
            userInput = scanner.nextInt();

            if (tenDigitNumber && userInput >= -128 && userInput <= 127) {
                System.out.println(fromTenToTwo(userInput));
                break;

            } else if (!tenDigitNumber && (userInput == 0 || userInput == 1)) {
                //todo

            } else print.typeMistake();
        }
    }

    private static StringBuilder fromTenToTwo(int userInput){
        StringBuilder finalNumber = new StringBuilder();

        if (userInput > 0) {
            return doPositive(userInput);

        } else return finalNumber.append(1);
    }

    private static StringBuilder doPositive(int userInput) {
        StringBuilder finalNumber = new StringBuilder("0");

        for (int i = 64; i > 0; i/=2){

            if (userInput >= i) {
                userInput -= i;
                finalNumber.append("1");
            } else finalNumber.append("0");
        }

        return finalNumber;
    }

    private static StringBuilder doNegative(int userInput) {
        StringBuilder finalNumber = new StringBuilder("1");

        return null; //todo
    }
}
