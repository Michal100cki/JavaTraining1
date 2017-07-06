package com.company;

/**
 * Created by Rokers on 2016-12-06.
 */
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called555");
    }

    @Override
    public void eat() {
        System.out.println( "Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println( "Funkcja Walk Dog");
        super.move(3);
//        move(30);
    }

    public void run(){
        System.out.println( "Funkcja Run Dog");
    move(10);
    }

    private void moveLegs(int speed){
        System.out.println( "MOVELEGS");
    }
    @Override
    public void move(int speed) {
        System.out.println( "Przeciazony MOVE");
        moveLegs(speed);

        super.move(speed);
    }
}
