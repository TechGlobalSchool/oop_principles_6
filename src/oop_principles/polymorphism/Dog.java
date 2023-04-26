package oop_principles.polymorphism;

public class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
}
