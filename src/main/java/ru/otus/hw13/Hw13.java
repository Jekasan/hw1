package ru.otus.hw13;

public class Hw13 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"11", "12", "13", "14"}, {"4", "4", "4", "4"}, {"8", "3", "6", "4"}, {"5", "4", "1", "3"}};
        try {
            try {
                int result = myMethod(arr);
                System.out.println(result);
            } catch (AppArraySizeException e) {
                System.out.println("Размер массива больше");
            }
        } catch (AppArrayDataException e) {
            System.out.println("Неверное значение массива!");
            System.out.println("Ошибка в массиве: " + e.i + " ячейка " + e.j);
        }

    }


    public static int myMethod(String[][] arr) throws AppArraySizeException, AppArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new AppArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new AppArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}
