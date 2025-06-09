package com.cybercrafters.model;

import java.io.Serializable;

public class Student implements Serializable {
    private String id;
    private String name;
    private String email;
    private String grade;

    // Constructor
    public Student(String id, String name, String email, String grade) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.grade = grade;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    // ... other getters/setters
    
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", id, name, email, grade);
    }
}
