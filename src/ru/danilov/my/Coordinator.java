package ru.danilov.my;

import java.util.Scanner;

public class Coordinator {
    private Printer print = new Printer();
    private Scanner scanner = new Scanner(System.in);
    private Converter converter = new Converter();
    private UserInputValidator userInputValidator = new UserInputValidator();

    public void kindOfConverting(){
        String userInputSystem;

        while (true) {
            print.AskUserToTypeNumberOfConverter();

            userInputSystem = scanner.nextLine();

            if (userInputSystem.equals("1")) {
                System.out.println(converter.fromTenToTwo.convert(userInputValidator.tenValidator()));
            }
            else if (userInputSystem.equals("2")) {
                System.out.println(converter.fromTwoToTen.convert(userInputValidator.twoValidator()));

                //todo //converter.fromTwoToTen.
            } else if (userInputSystem.equals("q")) {
                print.close();
                break;
            }
            else print.inputMistakeTypeNumberOneOrTwo();

        }
    }
}
