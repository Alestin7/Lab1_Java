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
    public static void setSurnames(String[] surnames) {
        Dictionaries.surnames = surnames;
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
    public static void setGenres(String[] genres) {
        Dictionaries.genres = genres;
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
    public static void setNames(String[] names) {
        Dictionaries.names = names;
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
    public static void setPositions(String[] positions) {
        Dictionaries.positions = positions;
    }
}