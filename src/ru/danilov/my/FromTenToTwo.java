package ru.danilov.my;

class FromTenToTwo {

    StringBuilder convert(int userInput){

        if (userInput >= 0) return doPositive(userInput);
        else return doNegative(userInput);
    }

    private StringBuilder doPositive(int userInput) {
        StringBuilder finalNumber = new StringBuilder("0");

        for (int i = 64; i > 0; i/=2){

            if (i == 8) {
                finalNumber.append(" ");
            }

            if (userInput >= i) {
                userInput -= i;
                finalNumber.append("1");
            } else finalNumber.append("0");
        }
        return finalNumber;
    }

    private StringBuilder doNegative(int userInput) {
        StringBuilder finalNumber = new StringBuilder("1");

        for (int i = -64; i < 0; i/=2){
            if (i == -8) {
                finalNumber.append(" ");
            }

            if (userInput >= i) {

                finalNumber.append("1");
            } else {
                finalNumber.append("0");
                userInput -= i;
            }
        }
        return finalNumber;
    }
}
