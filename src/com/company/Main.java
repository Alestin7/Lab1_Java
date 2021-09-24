package com.company;

import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    public static Random r = new Random();

    public static void main(String[] args) {
        // Base lvl
        System.out.print("Введите количество альбомов: ");
        int num = InputQuantity();
        Album[] album = new Album[num];
        InputData(album, num);

        OutputData(album, num);

        //////////////////////////////////////////////////////
        //Middle lvl
        num = r.nextInt(3) + 1;
        System.out.println("\n\n\nКоличество контрактов: " + num);
        Contract[] contract = new Contract[num];
        InputContract(contract, num);
        OutputContract(contract, num);
    }

    public static int InputQuantity() {
        int num = 0;
        Scanner amount = new Scanner(System.in);
        amount.reset();
        String number = "";
        do {
            number = amount.nextLine();
            try {
                num = Integer.parseInt(number);
            } catch (Exception e) {
                System.out.println("Неверный ввод");
            }
            if (num < 1) {
                System.out.println("Неверный ввод");
            }
        } while (num < 1);
        amount.close();
        return num;
    }

    public static void InputData(Album[] album, int num) {
        for (int i = 0; i < num; i++) {
            album[i] = new Album();
            System.out.println("Альбом № " + (i + 1) + ":");
            album[i].performer = Dictionaries.getSurnames()[r.nextInt(Dictionaries.getSurnames().length)];
            System.out.println("\nИсполнитель: " + album[i].performer);

            album[i].genre = Dictionaries.getGenres()[r.nextInt(Dictionaries.getGenres().length)];
            System.out.println("\nЖанр: " + album[i].genre);

            album[i].name = Dictionaries.getNames()[r.nextInt(Dictionaries.getNames().length)];
            System.out.println("\nНазвание альбома: " + album[i].name);

            album[i].edition = r.nextInt(15000) + 1;
            System.out.println("\nТираж: " + album[i].edition + "\n\n");
        }
    }

    public static void OutputData(Album[] album, int num) {
        System.out.println("Альбомы, тираж которых больше 10000: ");
        for (int i = 0; i < num; i++) {
            if (album[i].edition > 10000) {
                System.out.println("\nИсполнитель: " + album[i].performer);

                System.out.println("\nЖанр: " + album[i].genre);

                System.out.println("\nНазвание альбома: " + album[i].name);

                System.out.println("\nТираж: " + album[i].edition + "\n\n");
            }
        }
    }

    public static void InputContract(Contract[] contract, int num) {
        for (int i = 0; i < num; i++) {
            contract[i] = new Contract();
            System.out.println("\n\nКонтракт № " + (i + 1) + ":");
            contract[i].surname = Dictionaries.getSurnames()[r.nextInt(Dictionaries.getSurnames().length)];
            System.out.println("\nФамилия работника: " + contract[i].surname);

            contract[i].position = Dictionaries.getPositions()[r.nextInt(Dictionaries.getPositions().length)];
            System.out.println("\nДолжность работника: " + contract[i].position);


            int month = r.nextInt(12) + 1;
            int year = LocalDateTime.now().getYear();
            int day = r.nextInt(28) + 1;
            String time = Integer.toString(day) + "-" + Integer.toString(month) + "-" + Integer.toString(year);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(time);
            contract[i].startDate = LocalDateTime.of(year, month, day, 0, 0);
            System.out.println("\nДата подписания контракта: " + contract[i].startDate.format(dtf));

            contract[i].termDate = r.nextInt(363) + 1;
            System.out.println("\nСрок действия контракта: " + contract[i].termDate + " дней");

            contract[i].salary = r.nextInt(5000) + 5000;
            System.out.println("\nОклад: " + contract[i].salary + " долларов");
        }
    }

    public static void OutputContract(Contract[] contract, int num) {
        System.out.println("\n\n\nСведенья о работниках, срок действия контракта которых истекает в течении 5-ти дней:");
        for (int i = 0; i < num; i++) {
            long dif = Duration.between(contract[i].startDate.plusDays(contract[i].termDate), LocalDateTime.now()).toDays();
            if (dif >= 1 && dif <= 5) {
                System.out.println("\n\nФамилия работника: " + contract[i].surname);
                System.out.println("\nДолжность работника: " + contract[i].position);
                System.out.println("\nДата подписания контракта: " + contract[i].startDate);
                System.out.println("\nСрок действия контракта: " + contract[i].termDate + " дней");
                System.out.println("\nОклад: " + contract[i].salary + " долларов");
            }
        }
    }

}