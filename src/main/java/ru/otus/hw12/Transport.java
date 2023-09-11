package ru.otus.hw12;

public abstract class Transport {
    String name;
    int remainder;
    int сonsumption;

    @Override
    public String toString() {
        return name + " осталось " + remainder;
    }

    public Transport(String name, int remainder, int сonsumption) {
        this.name = name;
        this.remainder = remainder;
        this.сonsumption = сonsumption;
    }
    boolean move(Place place, int distance){
        return true;
    }
}
