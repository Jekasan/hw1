package ru.otus.hw12;

public class Allterrain extends Transport implements Movement {

    public Allterrain(String name, int remainder) {
        super(name, remainder, 6);
    }

    @Override
    public boolean move(Place place, int distance) {
        int tryDistance = distance / сonsumption;
        if (tryDistance > remainder) {
            System.out.println(name + " не хватило бензина");
            return false;
        }
        remainder -= tryDistance;
        System.out.println(name + " проехали " + distance + " по " + place.getDescription());
        return true;
    }
}

