package ru.otus.hw11;

public class Hw11 {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 15, 10, 1000);
        cat.run(80);
        cat.swim(0, 0);
        cat.info();
        Dog dog = new Dog("Бобик", 5, 20, 400);
        dog.run(400);
        dog.swim(10, 2);
        dog.info();
        Horse horse = new Horse("Рысак", 20, 29, 1000);
        horse.run(450);
        horse.swim(80, 4);
        horse.info();
    }
}
