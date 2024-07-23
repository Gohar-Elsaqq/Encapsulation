package org.example;

public class Student {
    private String name;
    private int id;
    private int age;

    // Constructor
    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        setAge(age); // Using the setter to validate age
    }
    // Getter and Setter for name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for age with validation
    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
           throw new IllegalArgumentException("Age must be positive");
        }

    }
}
