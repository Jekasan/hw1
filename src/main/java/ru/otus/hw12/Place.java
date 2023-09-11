package ru.otus.hw12;

public enum Place {
    FOREST("Лес"), PLAIN("Степь"), SWAMP("Болото");
    private String description;

    public String getDescription() {
        return description;
    }

    public boolean permission(Object object) {
        if (object == null) {
            return true;
        }
        if (object instanceof Car) {
            if (this == Place.PLAIN) {
                return true;
            }
            return false;
        }
        if (object instanceof Horse || object instanceof Bicycle) {
            if (this == Place.SWAMP) {
                return false;
            }
            return true;
        }
        if (object instanceof Allterrain) {
            return true;
        }
        return false;
    }

    Place(String desc) {
        this.description = description;
    }
}