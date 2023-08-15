package ru.otus.hw11;

public class Animal {
    private String name;
    private int runSpeed;
    private int swimSpeed;
    private int endurance;
    private int coef;
    private int rDistance;
    private int sDistance;
    private int rTime;
    private int sTime;

    public int getrDistance() {
        return rDistance;
    }

    public void setrDistance(int rDistance) {
        this.rDistance = rDistance;
    }

    public int getsDistance() {
        return sDistance;
    }

    public void setsDistance(int sDistance) {
        this.sDistance = sDistance;
    }

    public Animal(String name,int runSpeed,int swimSpeed,int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int run(int rDistance){
        setrDistance(rDistance);
        if ((endurance - rDistance) > 0) {
            endurance -= rDistance;
            rTime = rDistance / runSpeed;
        } else if ((endurance - rDistance) <= 0){
            rTime = -1;
            System.out.print("У животного: " + name + " появилась усталость.  ");
        }
        return rTime;
    }

    public int swim(int sDistance, int coef){
        setsDistance(sDistance);
        if ((endurance - sDistance) > 0) {
            endurance -= sDistance * coef;
            sTime = sDistance / swimSpeed;
        }
        if ((endurance - sDistance) <= 0){
            sTime = -1;
            System.out.print("У животного: " + name + " появилась усталость.  ");
        }
        return sTime;
    }

    public void info (){
        System.out.println("Имя: " + name + " Скорость бега: " + runSpeed + " Скорость плавания: " + swimSpeed + " Выносливость: " + endurance + " Дистанций(бег,плавание): " + rDistance + " " + sDistance + " Время: " + (rTime+sTime));
    }
}
