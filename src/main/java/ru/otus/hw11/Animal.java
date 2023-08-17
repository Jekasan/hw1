package ru.otus.hw11;

public class Animal {
    private String name;
    private int runSpeed;
    private int swimSpeed;
    private int endurance;
    private int coef;
    private int runDistance;
    private int swimDistance;
    private int runTime;
    private int swimTime;

    public Animal(String name, int runSpeed, int swimSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
    }

    public int run(int runDistance) {
        if ((endurance - runDistance) > 0) {
            endurance -= runDistance;
            runTime = runDistance / runSpeed;
        } else {
            runTime = -1;
            System.out.print("У животного: " + name + " появилась усталость.  ");
        }
        return runTime;
    }

    public int swim(int swimDistance, int coef) {
        if ((endurance - swimDistance) > 0) {
            endurance -= swimDistance * coef;
            swimTime = swimDistance / swimSpeed;
        } else {
            swimTime = -1;
            System.out.print("У животного: " + name + " появилась усталость.  ");
        }
        return swimTime;
    }

    public void info() {
        System.out.println("Имя: " + name + " Скорость бега: " + runSpeed + " Скорость плавания: " + swimSpeed + " Выносливость: " + endurance + " Дистанций(бег,плавание): " + runDistance + " " + swimDistance + " Время: " + (runTime + swimTime));
    }
}
