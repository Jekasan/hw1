package ru.otus.gladnev;

import java.util.Arrays;
import java.util.Scanner;

public class Hw1Gladnev {
    public static void main(String[] args) {
        // Задание 1
        printString(5, "Hello World!");
        // Задание 2
        int[] arr = {8, 4, 7, 9, 6};
        sumArrayFive(arr);
        // Задание 3
        int[] arr2 = new int[5];
        fillingArray(7, arr2);
        // Задание 4
        int[] arr3 = {4, 5, 8, 9, 11, 7};
        increaseArray(2, arr3);
        // Задание 5
        int[] arr4 = {12, 5, 8, 9};
        comparisonArray(arr4);
    }

    // Задание 1
    public static void printString(int n, String str) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    // Задание 2
    public static void sumArrayFive(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum = sum + arr[i];
            }
        }
        System.out.println("Сумма элементов массыва = " + sum);
    }

    // Задание 3
    public static void fillingArray(int number, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = number;
        }
        System.out.println("Массив заполнен " + Arrays.toString(arr2));
    }

    // Задание 4
    public static void increaseArray(int num, int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] += num;
        }
        System.out.println("Элементы массыва увеличены на " + num + ": " + Arrays.toString(arr3));
    }

    // Задание 5
    public static void comparisonArray(int[] arr4) {
        int sumFirst = 0;
        int sumSec = 0;
        for (int i = 0; i < arr4.length / 2; i++) {
            sumFirst = sumFirst + arr4[i];
        }
        for (int i = arr4.length / 2; i < arr4.length; i++) {
            sumSec = sumSec + arr4[i];
        }
        if (sumFirst > sumSec) {
            System.out.println("Сумма элементов первой половины массива > суммы элементов второй половины");
        }
        if (sumFirst < sumSec) {
            System.out.println("Сумма элементов первой половины массива < суммы элементов второй половины");
        }
        if (sumFirst == sumSec) {
            System.out.println("Сумма элементов первой половины массива = суммы элементов второй половины");
        }
    }
}