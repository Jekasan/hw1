package ru.otus.hw12;

public class Plate {
    public int maxFood;
    public int currentFood;
    public int addFood;

    public void addFood(int addFood) {
        if ((addFood + currentFood) <= maxFood) {
            currentFood += addFood;
        } else {
            System.out.println("Еды слишком много");
        }
    }

    public boolean eating(int eat) {
        if (eat >= 0 && eat <= currentFood) {
            currentFood -= eat;
            return true;
        }
        return false;
    }

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }
}