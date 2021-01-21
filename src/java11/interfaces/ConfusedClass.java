package java11.interfaces;

/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 3: Interfaces
Topic:  Default methods
*/

// Interface walkable has an abstract method and a default method
interface Walkable {
    void walk();

    default float getGait() {
        return 3.5f;
    }
}

// Interface Strollable has an abstract method and a default method
interface Strollable {
    void stroll();

    default float getGait() {
    	staticMethod();
        return 2.5f;
    }
    
    private static void staticMethod() {
    	System.out.println("Static method called..");
    }
}

// ConfusedClass implements both interfaces that both have the same
// default method defined
public class ConfusedClass implements Walkable,  Strollable {
    public static void main(String[] args) {
        ConfusedClass c = new ConfusedClass();
        c.walk();
        c.stroll();
        System.out.println(c.getGait());
    }

    public void walk() {
        System.out.println("When walking, gait is " +
                Walkable.super.getGait());
    }

    public void stroll() {
        System.out.println("When strolling, gait is " +
                Strollable.super.getGait());
    }


    public float getGait() {
        // Overrides both methods and implements it's own custom code
        return 5.2f;
    }
}