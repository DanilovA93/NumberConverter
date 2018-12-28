package ru.danilov.my;

class Printer {

    void AskUserToTypeNumberOfConverter(){
        System.out.println("Выберите необходимую систему.");
        System.out.println("1 - десятичный ввод.");
        System.out.println("2 - двоичный ввод.");
        System.out.println("q - закрытие программы.");
    }

    void inputMistakeTypeNumberOneOrTwo(){
        System.out.println("Ошибка ввода.");
    }

    void AskUserToTypeNumber(){
        System.out.println("Введите число в диапазоне [-128; 127].");
    }
    void AskUserToTypeNumberZeroOrOne(){
        System.out.println("Введите ряд из 8-ми чисел состоящий из 0 и/или 1.");
    }

    void close(){
        System.out.println("Завершение.");
    }
}

