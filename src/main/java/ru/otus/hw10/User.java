package ru.otus.hw10;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int eob;
    private String email;

    public User(String surname, String name, String patronymic, int eob, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.eob = eob;
        this.email = email;
    }

    public void info() {
        if ((eob + 40) <= 2023) {
            System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
            System.out.println("Год рождения: " + eob);
            System.out.println("e-mail: " + email);
            System.out.println();
        }
    }
}
