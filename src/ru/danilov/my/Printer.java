package ru.danilov.my;

class Printer {

    void systemInformation(){
        System.out.println("Введите необходимую систему.");
        System.out.println("2 - для двоичного ввода");
        System.out.println("10 - для десятичного");
    }

    void typeTwoOrTen(){
        System.out.println("Введите число 2 или 10");
    }

    void typeYourNumber(){
        System.out.println("Введите число из выбраной системы");
        System.out.println("Для двоичной системы число состоящее из 8-ми цифр (нули и единицы)");
        System.out.println("Для 10-ой системы число в диапазоне от -128 включительно до 127 включительно");
    }

    void typeMistake(){
        System.out.println("Для двоичной системы число состоящее из 8-ми цифр (нули и единицы)");
        System.out.println("Для 10-ой системы число в диапазоне от -128 включительно до 127 включительно");    }
}
