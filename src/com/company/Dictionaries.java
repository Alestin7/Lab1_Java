package com.company;

public class Dictionaries {
    private static String[] surnames = {
            "Сперанский",
            "Фомин",
            "Бастриков",
            "Пичугин",
            "Бекиров",
            "Евсеев",
            "Крапива"
    };

    public static String[] getSurnames() {
        return surnames;
    }

    private static String[] genres = {
            "Поп",
            "Метал",
            "Классика",
            "Рок",
            "Транс",
            "Электро",
            "Джаз",
            "Шансон",
            "Народная",
            "Блюз"
    };

    public static String[] getGenres() {
        return genres;
    }

    private static String[] names = {
            "You Went Away",
            "Monday Monday Monday",
            "City Girl",
            "Not Tonight",
            "Living Room",
            "RYLLZ",
            "Aligator",
            "More for me",
            "Superstar",
            "The First",
            "Freedom",
            "Run the World"
    };

    public static String[] getNames() {
        return names;
    }

    private  static String[] positions = {
            "Администратор",
            "Инженер",
            "Менеджер",
            "Охранник",
            "Санитар",
            "Программист",
            "Электрик",
            "Сантехник"
    };

    public static String[] getPositions() {return positions;}
}