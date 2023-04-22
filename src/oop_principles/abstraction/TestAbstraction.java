package oop_principles.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        // Phone phone1 = new Phone(); //Abstract class cannot be instantiated

        Samsung s1 = new Samsung();

        s1.call();
        s1.text();
        s1.ring();
    }
}
