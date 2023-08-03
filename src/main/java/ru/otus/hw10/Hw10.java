package ru.otus.hw10;

public class Hw10 {
    public static void main(String[] args) {
        User[] users = {
                new User("Гладнев", "Евгений", "Зурабович", 1987, "jekasan87@gmail.com"),
                new User("Гулов", "Иван", "Петрович", 1985, "jert7@gmail.com"),
                new User("Иванов", "Ефим", "Карлович", 1983, "jeka@gmail.com"),
                new User("Иванова", "Елена", "Ивановна", 1953, "jeka16544@gmail.com"),
        };

        for (int i = 0; i < users.length; i++) {
            users[i].info();
        }

        Box box = new Box(45, "red", false, "pen");
        box.info();
        box.setColor("white");
        box.info();
        box.setOpened(true);
        box.info();
        box.setArr("pen");
        box.info();
        box.setArr("pensil");
        box.info();
        box.setArr("apple");
        box.info();
        box.remArr("apple");
        box.info();

    }
}
