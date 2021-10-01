package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

/**
 * Contract class
 */
public class Contract {
    String surname;
    String position;
    LocalDateTime startDate;
    int termDate;
    int salary;

    public Contract(String surname, String position, LocalDateTime startDate, int termDate, int salary) {
        this.surname = surname;
        this.position = position;
        this.startDate = startDate;
        this.termDate = termDate;
        this.salary = salary;
    }

    /**
     * Generates new random filled contract
     * @return new random generated Contract type object
     */
    public static Contract generate() {
        Random r = new Random();
        return new Contract(Dictionaries.getSurnames()[r.nextInt(Dictionaries.getSurnames().length)],
                Dictionaries.getPositions()[r.nextInt(Dictionaries.getPositions().length)],
                LocalDateTime.of(LocalDateTime.now().getYear(), r.nextInt(12) + 1, r.nextInt(28) + 1, 0, 0),
                r.nextInt(363) + 1,
                r.nextInt(5000) + 5000);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    /**
     * start date for contract
     *
     * @param startDate start date
     */
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public int getTermDate() {
        return termDate;
    }

    public void setTermDate(int termDate) {
        this.termDate = termDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n\n" + surname + " {" +
                "\nДолжность: " + position +
                "\nДата подписания контракта: " + startDate.format(DateTimeFormatter.ofPattern("E d.M.y")) +
                "\nСрок действия контракта: " + termDate +
                "\nОклад: " + salary +
                '}';
    }

    public void Output(List<String> time, int num, int i) {
        System.out.println("\n\nФамилия работника: " + this.surname);
        System.out.println("\nДолжность работника: " + this.position);
        System.out.println("\nДата подписания контракта: " + time.get(i));
        System.out.println("\nСрок действия контракта: " + this.termDate + " дней");
        System.out.println("\nОклад: " + this.salary + " долларов");
    }
}