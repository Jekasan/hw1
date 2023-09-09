package ru.otus.hw12;

public class Car implements CurrentTransport {
    private int distance;
    @Override
    public void run() {
        System.out.println("Go");
    }
}
