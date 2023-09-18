package ru.otus.hw12;

public class Hw12Oop {
    public static void main(String[] args) {
        Human human = new Human("Я");
        Car car = new Car("Тачка", 100);
        Horse horse = new Horse("Рысак", 10);
        Bicycle bicycle = new Bicycle("Шульц", 5);
        Allterrain allterrain = new Allterrain("Джип", 50);

        Transport[] transports = new Transport[]{car, horse, bicycle, allterrain};
        Place place = null;

        while (true) {
            Transport transport = transports[random(transports.length)];
            place = Place.values()[random(Place.values().length)];

            human.setCurrentTransport(transport);

            boolean bMove = human.move(place, random(20) + 10);

            if (!bMove) {
                break;
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < transports.length; i++) {
            System.out.println(transports[i]);
        }
    }

    public static int random(int Max) {
        return (int) (Math.random() * Max);
    }

}