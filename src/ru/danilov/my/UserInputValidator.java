package ru.danilov.my;

import java.util.Scanner;

class UserInputValidator {
    private Printer print = new Printer();
    private Scanner scanner = new Scanner(System.in);

    int tenValidator (){
        int userInput;

        while (true) {
            print.AskUserToTypeNumber();

            userInput = scanner.nextInt();

            if (userInput >= -128 && userInput <= 127) {
                return userInput;
            }
        }
    }

     String twoValidator(){
        String userInput;

        while (true) {
            print.AskUserToTypeNumberZeroOrOne();

            userInput = scanner.nextLine();

            if (userInput.length() == 8) {
                if (userInput.matches("[01]+")) {
                    return userInput;
                }
            }
        }
    }
}
