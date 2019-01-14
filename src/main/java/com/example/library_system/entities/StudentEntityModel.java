package com.example.library_system.entities;

public class StudentEntityModel {
    private int studentId;
    private String name;
    private int rentedBookId;

    public StudentEntityModel(int studentId, String name, int rentedBookId) {
        this.studentId = studentId;
        this.name = name;
        this.rentedBookId = rentedBookId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRentedBookId(int rentedBookId) {
        this.rentedBookId = rentedBookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getRentedBookId() {
        return rentedBookId;
    }
}
