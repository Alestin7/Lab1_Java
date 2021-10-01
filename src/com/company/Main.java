package com.company;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;

public class    Main {
    public static Random r = new Random();

    public static void main(String[] args) {
        // Base Lvl
        /*Albums albums = new Albums();

        albums.fillRandom(10);

        System.out.println(albums);

        System.out.println("\n\n\nEdition > 10000: \n" + albums.findGreater1000());*/

        ///////////////////////////////////////////////////

        // Medium Lvl

        Contracts contracts = new Contracts();

        contracts.RandomContract(10);

        System.out.println(contracts);

        System.out.println("\n\n\nРаботники, контракт которых истекает в течении 5-ти дней: \n" + contracts.findTerm_5day());
        /*
        // Base lvl
        System.out.print("Введите количество альбомов: ");
        int num = InputQuantity();
        Album[] album = new Album[num];
        InputData(album);

        OutputData(album);

        //////////////////////////////////////////////////////
        // Middle lvl
        num = r.nextInt(3)+1;
        System.out.println("\n\n\nКоличество контрактов: " + num);
        Contract[] contract = new Contract[num];
        List<String> time = new ArrayList<>(contract.length);
        InputContract(contract, time, num);
        OutputContract(contract, time, num);
        */

    }

    public static int InputQuantity() {
        int num = 0;
        Scanner amount = new Scanner(System.in);
        amount.reset();
        String number="";
        do {
            number = amount.nextLine();
            try {
                num = Integer.parseInt(number);
            } catch (Exception e) {
                System.out.println("Неверный ввод");
            }
            if(num<1){
                System.out.println("Неверный ввод");
            }
        } while (num < 1);
        amount.close();
        return num;
    }

    public static void InputData(Album[] album) {
        for (int i = 0; i < album.length; i++) {
            album[i]=new Album(Dictionaries.getSurnames()[r.nextInt(Dictionaries.getSurnames().length)],
                    Dictionaries.getGenres()[r.nextInt(Dictionaries.getGenres().length)],
                    Dictionaries.getNames()[r.nextInt(Dictionaries.getNames().length)],
                    r.nextInt(15000)+1);
            System.out.println("Альбом № " + (i+1) + ":");
            album[i].Output();
        }
    }

    public static void OutputData(Album[] album)
    {
        System.out.println("Альбомы, тираж которых больше 10000: ");
        for (int i = 0; i< album.length; i++){
            if(album[i].edition > 10000){
                album[i].Output();
            }
        }
    }

    public static List<String> InputContract(Contract[] contract, List<String> time, int num)
    {
        for (int i = 0; i< contract.length; i++)
        {
            int month = r.nextInt(12)+1;
            int year = LocalDateTime.now().getYear();
            int day = r.nextInt(28)+1;
            time.add(Integer.toString(day) + "-" + Integer.toString(month) + "-" + Integer.toString(year));
            contract[i] = new Contract(Dictionaries.getSurnames()[r.nextInt(Dictionaries.getSurnames().length)],
                    Dictionaries.getPositions()[r.nextInt(Dictionaries.getPositions().length)],
                    LocalDateTime.of(year, month, day,  0, 0),
                    r.nextInt(363)+1,
                    r.nextInt(5000)+5000);
            System.out.println("\n\nКонтракт № "+(i+1)+":");
            contract[i].Output(time, num, i);
        }
        return time;
    }

    public static void OutputContract(Contract[] contract, List<String> time, int num)
    {
        System.out.println("\n\n\nСведенья о работниках, срок действия контракта которых истекает в течении 5-ти дней:");
        for (int i = 0; i < contract.length; i++)
        {
            long dif = 0;
            dif = Duration.between(contract[i].startDate.plusDays(contract[i].termDate), LocalDateTime.now()).toDays();
            if (dif >= 1 && dif <=5){
                contract[i].Output(time, num, i);
            }
        }
    }
}