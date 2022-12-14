package io.ahmed.liquidbasedemo;

import javax.persistence.*;


//Our entity class is here, and it utilized the table "persons"
@Entity
@Table(name = "persons")
public class Person {
    // Specifying our ID, with @Id and its GeneratedValue and which column is it in
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    //We specify another column in the table that houses name
    @Column
    private String name;

    //We specify another column in the table that houses the height
    @Column
    private String height;


    public Person(){
        //for assistance
    }

    //our constructor , setters and getters.
    public Person(String name, String height){
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
