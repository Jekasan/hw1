package ru.otus.hw12;

public class Horse extends Transport implements Movement {
    int remainder;

    public Horse(String name, int remainder) {
        super(name, remainder,3);
    }

    @Override
    public boolean move(Place place, int distance) {
        if (!place.permission(this)) {
            System.out.println(name + " не едет по " + place.getDescription());
            return false;
        }
        int tryDistance = distance / сonsumption;
        if (tryDistance > remainder) {
            System.out.println(name + " не хватило сил");
            return false;
        }
        remainder -= tryDistance;
        System.out.println(name + " проехали " + distance + " по " + place.getDescription());
        return true;
    }
}