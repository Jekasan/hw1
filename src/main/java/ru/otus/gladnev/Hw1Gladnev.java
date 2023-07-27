package ru.otus.gladnev;

import java.util.Arrays;
import java.util.Scanner;

public class Hw1Gladnev {
    public static void main(String[] args) {
        // Задание 1
        int[][] arr = {{0, 0, 2, 2, 2}, {2, 2, 2, 2, 2}};
        System.out.println(sumOfPositiveElements(arr));
        // Задание 2
        int size = 3;
        printSquare(size);
        // Задание 3
        int[][] arr3 = new int[10][10];
        arrayDiagonal(arr3);
        // Задание 4
        int[][] arr4 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Максимальное значение = " + findMax(arr4));
        // Задание 5
        int[][] arr5 = {{1, 1, 1}, {2, 2, 2}};
        System.out.println("Сумма = " + sumOfSecondStringOfArray(arr5));
    }

    // Задание 1
    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    // Задание 2
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Задание 3
    public static void arrayDiagonal(int[][] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                arr3[i][j] = 1;
            }

        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if (i == j || i == arr3.length - j - 1) {
                    arr3[i][j] = 0;
                }
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();

        }

    }

    // Задание 4
    public static int findMax(int[][] arr4) {
        int max = 0;
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (max < arr4[i][j]) {
                    max = arr4[i][j];
                }
            }
        }
        return max;
    }

    // Задание 5
    public static int sumOfSecondStringOfArray(int[][] arr5) {
        int sum = 0;
        if (arr5.length > 1) {
            for (int i = 0; i < arr5[1].length; i++) {
                sum += arr5[1][arr5.length];
            }
        }
        if (arr5.length <= 1) {
            sum = -1;
        }
        return sum;
    }
}