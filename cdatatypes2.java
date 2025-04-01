class Person {
    String name;
}

// how non-primitive datatypes are stored.
// non-primitive datatypes are also called reference datatypes.
// imp point -
/*
 * 📌 Reference Data Types in Java
 * Reference data types store memory addresses instead of actual values. These
 * references point to objects stored in heap memory, while the reference
 * variables themselves are stored in stack memory.
 * 
 * This distinction is important because:
 * ✔ Objects are accessed indirectly through references.
 * ✔ Multiple references can point to the same object.
 * ✔ Changes made through one reference affect all references pointing to that
 * object.
 */
public class cdatatypes2 {

    public static void main(String[] args) {
        Person p1 = new Person();// here A new Person object is created in heap memory.
        // what happens after above line is executed.
        /*
         * Heap Memory:
         * A new Person object is created.
         * The object has an instance variable name (currently null).
         * 
         * Stack Memory:
         * A reference variable p1 is created in stack memory.
         * p1 stores the memory address of the Person object in heap.
         */
        p1.name = "Shivraj";
        /*
         * Stack Memory: Heap Memory:
         * +------+ +----------------+
         * | p1 | -----> (Addr1) | Person Object |
         * +------+ | name = "Shivraj" |
         * +----------------+
         * 
         */

        System.out.println(p1.name);
        Person p2 = p1;
        /*
         * after above line what happens.
         * A new reference variable p2 is created.
         * p2 does not create a new object but stores the same address as p1.
         * Both p1 and p2 now point to the same object in heap.
         * 
         * Stack Memory:             Heap Memory:
            +------+                 +----------------+
            | p1   | -----> (Addr1)  | Person Object    |
            +------+                 | name = "Shivraj" |
            | p2   | -----> (Addr1)  +----------------+
            +------+

        ✔ p1 and p2 store the same memory address.
        ✔ No new object is created, only another reference.

          */
        p2.name = "Rahul";
        //here name is updated to rahul.
        System.out.println(p2.name);//rahul
        System.out.println(p1.name);//rahul

    }
}
