package ru.otus.hw12;

public class Cat {
    private String name;
    private int appetite;

    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    void eat(Plate plate) {
        if (appetite <= plate.currentFood) {
            plate.eating(appetite);
            System.out.println("Кот " + name + " поел");
            satiety = true;
        } else {
            System.out.println("Коту " + name + " не хватает еды");
        }
    }

    public void info(){
        String message = satiety ? "кот сыт" : "Кот голоден";
        System.out.println("Имя: " + name + " Аппетит: " + appetite + " сытость: " + message);
    }

}