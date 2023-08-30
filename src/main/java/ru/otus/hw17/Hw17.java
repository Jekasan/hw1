package ru.otus.hw17;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Hw17 {
    public static void main(String[] args) {
        var dir = new File("src");
        FileFilter fileFilter = file -> !file.isDirectory() && file.getName().endsWith(".txt");
        System.out.println(Arrays.stream(dir.listFiles(fileFilter)).map(it -> it.getName()).toList());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла из списка выше: ");
        String fileName = scanner.nextLine();

        java.io.FileInputStream in1 = null;
        try {
            in1 = new java.io.FileInputStream("src/" + fileName);
        } catch (java.io.FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try (InputStreamReader in = new InputStreamReader(in1)) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Введите текст для записи в файл: ");
        String text = scanner.nextLine();
        try (FileOutputStream out = new FileOutputStream("src/" + fileName, true)) {
            byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
