/*
 * 🔹 Non-Primitive Data Types in Java
Non-primitive data types are more complex and store references (memory addresses) to objects rather than actual values.
Unlike primitive types, non-primitive types are created by the programmer and can hold multiple values or have methods.

📌 Types of Non-Primitive Data Types in Java
        -Classes
        -Interfaces
        -Strings
        -Arrays
        -Enums
 */







//1. Class
/*One common non-primitive data type in Java is the class. 
Classes are used to create objects, which are instances of the class. 
A class defines the properties and behaviours of objects, including variables (fields) and methods.

For example, you might create a Person class to represent a person, 
with variables for the person's name, age, and address, and methods to set and get these values. */

class Person {
    String name;
    int age;
    String city;
}









// 2 interfaces
/*
 * 🔹 What is an Interface in Java?
 * An interface in Java is a blueprint for a class that contains only abstract
 * methods and constants (until Java 8, after which default and static methods
 * were introduced).
 * It is used to achieve abstraction and multiple inheritance in Java.
 * 
 * in simple language-
 * An interface in Java is like a contract that says,
 * "Hey, if you want to be called a Car, you must have a start() and stop() method!"
 * But the interface does not say how these methods should work.
 * It just says they must exist.
 * 
 * 
 * 🔸 Example in Real Life
 * Imagine an electric plug socket.
 * The interface is the shape of the plug.
 * The implementation is how the electricity is supplied.
 * Any company making a charger must follow this plug design.
 */

// declaration of an interface.
interface Vehicle {
    void start();

    void stop();
}

// implementing the interface.
// Class implements the interface. meaning whatever methods that are listed in
// an interface its working is defined in class.
// below is the declaration to implement the interface in a class.
// in this class we have to declare all the methods
class Car implements Vehicle {
    public void start() {// need to use public keyword bcoz by default method is not public i guess.
        System.out.println("car is starting.");
    }

    public void stop() {
        System.out.println("car is stopping.");
    }
}

public class cdatatypes3 {
    public static void main(String[] args) {
        // to use the interface now
        Vehicle v1 = new Car();// here we define : interface_name obj = new class_Name
        v1.start(); // using the methods from the interfaces.
        v1.stop();
        /*
         * 🔸 Explanation
         * 1️⃣ Vehicle is an interface with two methods: start() and stop().
         * 2️⃣ Car implements Vehicle, so it must provide implementations for start()
         * and stop().
         * 3️⃣ Main class creates an object and calls the methods.
         */








        // 3. Strings
        // we can define string in two ways:
        // 1. char[] - stores in a list of characters
        // 2. String keyword.- stores the whole string literal.
        // Actually Java provides a special String class to handle strings.

        String ch = "Hello";// defining a string literal.
        String ch2 = "Hello";
        // note- In C, string literals are stored in the static (read-only) memory
        // segment, while in Java, they are stored in the Heap (String Pool).

        // as string is a class alredy defined in java there are various methods as well
        // in the string class.
        // methods such as length(), touppercase(), tolowercase() etc.
        // String is Immutable (Cannot be Changed)

        // Difference between "==" and equals().
        // 1. == checks memory reference
        System.out.println(ch == ch2);

        // 2.equals() Checks Actual Value
        System.out.println(ch.equals(ch2));


        //Methods in string class.
        System.out.println(ch.length());
        System.out.println(ch.charAt(1));
        System.out.println(ch.toLowerCase());
        System.out.println(ch.toUpperCase());
        System.out.println(ch.indexOf( "l"));


    }
}
