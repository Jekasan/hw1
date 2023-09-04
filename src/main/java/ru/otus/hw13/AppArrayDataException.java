package ru.otus.hw13;

public class AppArrayDataException extends Exception {
    public int i;
    public int j;

    AppArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }
}
