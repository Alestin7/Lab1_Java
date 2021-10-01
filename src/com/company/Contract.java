package com.company;

import java.time.LocalDateTime;
import java.util.List;

public class Contract {
    String surname;
    String position;
    LocalDateTime startDate;
    int termDate;
    int salary;



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

    public Contract(String surname, String position, LocalDateTime startDate, int termDate, int salary) {
        this.surname = surname;
        this.position = position;
        this.startDate = startDate;
        this.termDate = termDate;
        this.salary = salary;
    }

    public void Output(List<String> time, int num, int i){
        System.out.println("\n\nФамилия работника: " + this.surname);
        System.out.println("\nДолжность работника: " + this.position);
        System.out.println("\nДата подписания контракта: " + time.get(i));
        System.out.println("\nСрок действия контракта: " + this.termDate + " дней");
        System.out.println("\nОклад: " + this.salary + " долларов");
    }
}