package com.company;

/**
 * Created by Rokers on 2016-12-06.
 */
public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;


    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
public void eat(){
    System.out.println( "Animal eat() called666");
}

public void move(int speed){
    System.out.println( "ANimal55 Zwierzak biegnie z predkosci "+speed);
}
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
