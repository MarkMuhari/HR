package hu.webuni.hr.markmuhari.model;

import java.time.LocalDateTime;

public class Employee {

    private long Id;
    private String name;
    private String assignment;
    private int monthlyPay;
    private LocalDateTime startingDate;

    public Employee() {
    }

    public Employee(long id, String name, String assignment, int monthlyPay, LocalDateTime startingDate) {
        this.Id = id;
        this.name = name;
        this.assignment = assignment;
        this.monthlyPay = monthlyPay;
        this.startingDate = startingDate;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public int getMonthlyPay() {
        return monthlyPay;
    }

    public void setMonthlyPay(int monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    public LocalDateTime getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDateTime startingDate) {
        this.startingDate = startingDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + Id +
                ", name='" + name + '\'' +
                ", assignment='" + assignment + '\'' +
                ", monthlyPay=" + monthlyPay +
                ", startingDate=" + startingDate +
                '}';
    }
}
