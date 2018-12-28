package ru.danilov.my;

class FromTwoToTen {

    int convert(String userInput){

        if (userInput.charAt(0) == '0') return doPositive(userInput);
        else return doNegative(userInput);
    }

    private int doPositive(String userInput) {
        int finalNumber = 0;

        for (int i = 0; i < 8; i++){
            if (userInput.charAt(i) == '1'){
                finalNumber += Math.pow(2, (userInput.length() - (i + 1)));
            }
        }
        return finalNumber;
    }

    private int doNegative(String userInput) {
        int finalNumber = 1;

        for (int i = 0; i < 8; i++){
            if (userInput.charAt(i) == '0'){
                finalNumber += Math.pow(2, (userInput.length() - (i + 1)));
            }
        }
        return finalNumber * -1;
    }
}
