package ru.otus.hw12;

public class Hw12 {
    public static void main(String[] args) {

        Cat[] cat = {
                new Cat("Барсик", 1777, 200),
                new Cat("Боб", 20, 300),
                new Cat("Мурзик", 35, 400),
        };

        for (int i = 0; i < cat.length; i++) {
            cat[i].info();
        }

    }
}
