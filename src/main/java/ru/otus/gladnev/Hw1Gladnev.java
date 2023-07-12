package ru.otus.gladnev;

import java.util.Scanner;

public class Hw1Gladnev {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        greetings();
        System.out.println("Задание 2");
        checkSign(5, 5, 5);
        System.out.println("Задание 3");
        selectColor(7);
        System.out.println("Задание 4");
        compareNumbers(8, 7);
        System.out.println("Задание 5");
        addOrSubtractAndPrint(5, 5, false);

        System.out.println("Введите номер задания (от 1 до 5): ");
        Scanner scan = new Scanner(System.in);
        int select = scan.nextInt();
        // Задание 1
        if (select == 1) {
            greetings();
        }
        // Задание 2
        if (select == 2) {
            checkSign(5, 5, 5);
        }
        // Задание 3
        if (select == 3) {
            selectColor(7);
        }
        // Задание 4
        if (select == 4) {
            compareNumbers(8, 7);
        }
        // Задание 5
        if (select == 5) {
            addOrSubtractAndPrint(5, 5, false);
        }
        if (select > 5 || select < 1) {
            System.out.println("Неверный ввод");
        }
    }

    // Задание 1
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    // Задание 2
    public static void checkSign(int a, int b, int c) {
        int summ = a + b + c;
        if (summ >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Задание 3
    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    // Задание 4
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Задание 5
    public static void addOrSubtractAndPrint(int intValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(intValue + delta);
        } else {
            System.out.println(intValue - delta);
        }
    }

}