package ru.otus.hw12;

public class Cat {
    private String name;
    private int appetite;

    private boolean satiety;

    public Cat(String name, int appetite,int maxFood) {
        Plate plate = new Plate(maxFood);
        this.satiety = plate.eating(appetite);
        this.name = name;
        this.appetite = appetite;
    }

    public void info(){
        System.out.println("Имя: " + name + " Аппетит: " + appetite + " сытость: " + satiety);
    }

}
