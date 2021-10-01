package com.company;

import java.util.Random;

public class Album {
    String performer;
    String genre;
    String name;
    int edition;

    public Album(String performer, String genre, String name, int edition) {
        this.performer = performer;
        this.genre = genre;
        this.name = name;
        this.edition = edition;
    }

    public static Album generate() {
        Random r = new Random();
        return new Album(Dictionaries.getSurnames()[r.nextInt(Dictionaries.getSurnames().length)],
                Dictionaries.getGenres()[r.nextInt(Dictionaries.getGenres().length)],
                Dictionaries.getNames()[r.nextInt(Dictionaries.getNames().length)],
                r.nextInt(15000) + 1);
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void Output() {
        System.out.println("\nИсполнитель: " + this.performer);
        System.out.println("\nЖанр: " + this.genre);
        System.out.println("\nНазвание альбома: " + this.name);
        System.out.println("\nТираж: " + this.edition + "\n\n");
    }

    @Override
    public String toString() {
        return System.lineSeparator() + name + " {" +
                "\nИсполнитель: " + performer +
                "\nЖанр: " + genre +
                "\nТираж: " + edition +
                '}';
    }
}