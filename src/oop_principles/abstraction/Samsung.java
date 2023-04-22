package oop_principles.abstraction;

public class Samsung extends Phone {

    public Samsung(){}

    public Samsung(String color){
        super(color);
    }

    @Override
    public void call() {
        System.out.println("Samsung calls");
    }

    @Override
    public void text() {
        System.out.println("Samsung texts");
    }
}
