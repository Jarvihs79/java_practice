class Car{
    String name;
    int year;
    int kms;
}


public class cdatatypes1 {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();


        c1.name = "honda";
        c1.year= 2010;
        c1.kms= 10000;

        c2.name = "hero";
        c2.year= 2015;
        c2.kms= 1000;

        c3.name = "tata";
        c3.year= 2023;
        c3.kms= 100;

        System.out.println("Car name-"+ c1.name + "manufactured year -"+ c1.year+ "kms done till now-"+c1.kms );
        System.out.println("Car name-"+ c2.name + "manufactured year -"+ c2.year+ "kms done till now-"+c2.kms );
        System.out.println("Car name-"+ c3.name + "manufactured year -"+ c3.year+ "kms done till now-"+c3.kms );




    }

    // all non primitive datatypes.

    // before nnon primiitive datatypes i want to learn what is object in java.
    // An object in Java is an instance of a class. It is a real-world entity that
    // has state (data/attributes) and behavior (methods/functions).

    /*
     * 🔥 Key Points About Objects
     * ✔ Objects are instances of a class.
     * ✔ Each object has its own copy of instance variables.
     * ✔ Multiple objects of a class can exist independently.
     * ✔ Objects are stored in heap memory.
     * ✔ Objects are referenced using variables (Car myCar).
     */

    /*
     * ✅ Real-Life Analogy
     * Think of a class as a blueprint for a house, and an object as an actual house
     * built from that blueprint.
     * You can create multiple houses (objects) from the same blueprint (class),
     * but each house can have different features (attributes).
     */

    /*
     * 🔹 How is an Object Created in Java?
     * Objects are created using the new keyword.
     * "ClassName objectName = new ClassName();"
     */

}