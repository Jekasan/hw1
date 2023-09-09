package ru.otus.hw12;

public class Bicycle implements CurrentTransport {
    private int distance;
    @Override
    public void run() {
        System.out.println("Go");
    }
}
