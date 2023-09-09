package ru.otus.hw12;

public class Hw12 {
    public static void main(String[] args) {

<<<<<<< HEAD
    }
}
=======
        Cat[] cat = {
                new Cat("Барсик", 1700),
                new Cat("Боб", 20),
                new Cat("Мурзик", 35),
        };
        Plate plate = new Plate(40);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            cat[i].info();
        }

    }
}
>>>>>>> origin/hw12
