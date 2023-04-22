package oop_principles.abstraction;

public class IPhone extends Phone{

    @Override
    public void call() {
        System.out.println("IPhone calls");
    }

    @Override
    public void text() {
        System.out.println("IPhone texts");
    }

    @Override
    public void ring(){
        System.out.println("IPhone rings");
    }
}
