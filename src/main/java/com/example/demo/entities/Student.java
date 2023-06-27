package com.example.demo.entities;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Student  {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long Id;


    private String firstName;
    private String lastName;
    private String Email;

    public Student(long id, String firstName, String lastName, String email) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        Email = email;
    }

    public Student() {
        super();
    }

    public String toString()  {
        return "Id : "+Id+"\nFirst Name : "+firstName+"\nLast Name : "+lastName+"\nEmail : "+Email;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
