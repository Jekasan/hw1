package ru.otus.hw12;

public enum Place {
    FOREST("Лес"), PLAIN("Степь"), SWAMP("Болото");
    private String description;

    public String getDescription() {
        return description;
    }

    Place(String description) {
        this.description = description;
    }
}