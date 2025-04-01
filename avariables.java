 //learning about types of variables.
 //1.local variables
 //2.static variables
 //3.instance variables
 
 
 class Inneravariables {
    //here i used public before class and i got error the thing is the public can be used with only the class whose name matches with the filename.
    String name;//these are the instance variables 
    int age;  

    //note- if no constructor is defined then java gives a default constructor with the same class name that initializes the vars to default values. 

static String college = "sinhgad";

}



public class avariables {
    
    public static void main(String[] args){
        
        int ab;//local variable ab can be used locally only the scope is restricted to the class only.
        //local variables dont have access modifiers.(public , private, static)
        ab = 10;
        System.out.println(ab);

        Inneravariables s1= new Inneravariables();//we are creating the object of the class.s1 is a reference variable that will store the address of the created object in Heap Memory.// It is stored in Stack Memory.
                        //new is a special keyword in Java that:
                        //Allocates memory in the Heap for a new object.Calls the constructor of the class. 
                        //Inneravariables() is the default constructor of the Inneravariables class.
                        //If no constructor is defined, Java provides a default constructor that initializes instance variables with their default values (null for Strings, 0 for numbers, false for booleans).





        s1.name="shivraj";
        s1.age=22;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(Inneravariables.college);//as this is a static var we can access it using only the class name we dont need to create any object for it.

    }
}
