package ru.otus.hw12;

public class Human {
    private String name;
    Transport currentTransport;

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(Transport currentTransport) {
        if (currentTransport == null) {
            if (this.currentTransport != null) {
                System.out.println(name + " покину " + this.currentTransport);
                this.currentTransport = null;
            }
            return;
        }
        if (this.currentTransport == currentTransport) {
            System.out.println(name + " уже сижу в " + currentTransport);
            return;
        }
        if (this.currentTransport == null) {
            System.out.println(name + " использует " + currentTransport);
            this.currentTransport = currentTransport;
            return;
        }
        System.out.println(name + " сменил " + this.currentTransport + " на " + currentTransport);
        this.currentTransport = currentTransport;
    }

    public boolean move(Place place, int distance) {
        if (currentTransport != null) {
            return currentTransport.move(place, distance);
        }
        System.out.println("Пешком " + place.getDescription() + " " + distance);
        return true;
    }

    public Human(String name) {
        this.name = name;
    }
}
