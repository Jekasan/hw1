package ru.otus.hw10;

import java.util.Arrays;

public class Box {
    private final int size;
    private String color;

    private boolean opened;

    private String[] arr = new String[7];


    public Box(int size, String color, Boolean opened, String put) {
        this.size = size;
        this.color = color;
        this.opened = opened;
    }

    public float getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getOpened() {
        return opened;
    }

    public void setOpened(Boolean opened) {
        this.opened = opened;
    }

    public float getSize(float size) {
        return size;
    }

    public void remItem(String put){
        if (opened && put != null && put != "") {
            for (int i = 0; i < arr.length; i++) {
                if (put.equals(arr[i])) {
                    arr[i] = null;
                    break;
                }
            }
        }
    }

    public void setItem(String put) {
        if (opened && put != null && put != "") {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null) {
                    arr[i] = put;
                    break;
                }
            }
        }
    }

    public void info() {
        String message = opened ? "Коробка открыта" : "Коробка закрыта";
        System.out.println("Размер: " + size + " Цвет:  " + color + " Состояние: " + message + " Предметы: " + Arrays.asList(arr));
        System.out.println();
    }
}