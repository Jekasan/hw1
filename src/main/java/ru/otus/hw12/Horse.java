package ru.otus.hw12;

public class Horse implements CurrentTransport {
    private int distance;
    @Override
    public void run() {
        System.out.println("Go");
    }
}
