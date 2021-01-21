package java11.generics;

/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 4: Generics and Collections
Topic:  Using  wrapper classes, operators
*/

public class WrapperOperators {
    public static void main(String[] args) {

        short i = 10;
        Integer j = 10;

        // A wrapper used in most operations is unboxed prior to the 
        // operation

        // result of a wrapper and primitive can be assigned to a primitive
        // variable
        int intResult =  i + j;

        // result of a wrapper and primitive can be assigned to a wrapper
        // variable
        short integerResult = (short) (i + j);

        // result of a wrapper and primitive can be assigned to a 
        // LVTI variable using var
        var result = i + j;

        System.out.println("intResult (type int) = " + intResult);
        System.out.println("integerResult (type Integer) = " + integerResult);
        System.out.println("result (LVTI) = " + result);

        Integer k = 10;
        Number s = Short.valueOf("10");
        int m = 10;
        if (s instanceof Number) {
            System.out.println(" s is instance of Number ");
            if (s instanceof Integer) {
                System.out.println(" m is instance of Integer ");
            }
        }
    }
}