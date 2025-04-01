public class cdatatypes {
  public static void main(String[] args){



    //1.integer datatypes
    //there are 4 integer datatypes.

    byte c = 12;
    short d = 30000;
    int a= 10;
    long b = 500000;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
   /* 
    Data Type	Size	    Default Value	        Range	                When to Use?
    byte	    1 byte	    0	                    -128 to 127	    	    Memory-efficient for large arrays, file I/O
    short	    2 bytes	    0	                    -32,768 to 32,767		Embedded systems, file formats, 16-bit apps
    int	        4 bytes	    0	                    -2,147,483,648 to 		Default for integers, counters, IDs
                                                    2,147,483,647
    long	    8 bytes	    0L	                    -9 Quintillion to 		Large numbers like timestamps, financial apps
                                                    9 Quintillion

     Best Practices: When to Use Which?
        ✅ Use byte and short if memory is a concern (IoT, large datasets).
        ✅ Use int for general purposes—it’s the most optimized in Java.
        ✅ Use long for massive numbers like timestamps and finance data.       
        
    Note : by default it is int.
    */






    //2.float datatypes
    //there are 2 dtypes for decimal nos (i.e the nos with fractional part)

    float e = 300000000000000.30002942973979434837484738473492942938293293290f;//must write f. bcoz by default java treats the decimal nos as double, we use f to tell its a float.
    double f = 400000000.59999999999999999999943343933393943939493334947393473974947947392932982382938293829382938298398329384738738438438384738438483478374837;
    float g = 3.145748588548f;
    double h = 3.1456655696996;
    System.out.println(e);
    System.out.println(f);
    System.out.println("value of pi using float-"+g);
    System.out.println("value of pi using double-"+h);

    /*
     In Java, floating-point data types are used to store decimal numbers (numbers with a fractional part). Java provides two floating-point types:

        Data Type	    Size	    Default Value	    Range	        Precision	            Use Cases
        float	        4 bytes	    0.0f	            ±3.4 × 10³⁸	    7 decimal digits	    Graphics, Physics, Game Development
        double	        8 bytes	    0.0d	            ±1.8 × 10³⁰⁸	15-16 decimal digits	Finance, Scientific Calculations, Machine Learning

     */

     //special floating point values
     //1. infinity
        System.out.println(1.0/0.0);
        System.out.println(-1.0/0.0);

    //2. not a number
        System.out.println(0.0/0.0);

    /*
      Best Practices
        ✅ Use double for accurate calculations (default for decimal numbers).
        ✅ Use float when memory is limited (games, sensors).
        ✅ For currency calculations, use BigDecimal instead of double.
     */








    //3. char datatype
    /*
     Size: 2 bytes (16 bits)
        Default Value: \u0000 (null character)
        Range: 0 to 65535 (Unicode character set)
        When to Use?
            ✅ When you need to store single characters like letters, symbols, and digits.
     */

    char i = 'a';
    System.out.println(i);

    char j = 99;//ascii reprn of a char. all chars in english have an ascii value.range 0-127
    System.out.println("the ascii value 99 belongs to letter - "+j);

    char k = '\u0928';//this is unicode reprn system.it should print na(hindi na)
    System.out.println(k);
    //Unicode is a universal character encoding system that assigns a unique number to every character in different languages.
    //Range: 0 to 65535 (Unicode character set)

    //escape sequences
    System.out.println("hello \n world");//\n is a newline char escape sequence
    System.out.println("hello \t world");//\t is a tab sequence
    System.out.println("hello \'world\'");
    System.out.println("hello \"world\"");
    /*
      Where is char Used in Java?
        ✅ Storing single characters (like user initials, gender 'M' or 'F').
        ✅ Used in switch-case statements.
        ✅ Processing Unicode characters (e.g., ह, 中, €).
        ✅ Escape sequences (e.g., \n, \t, \', \", \\).
     */






     //4. boolean datatype
     boolean javafun = true;
     boolean javabore = false;
     System.out.println("is java fun-"+javafun);
     System.out.println("is java bore-"+javabore);
     /*
       Where is boolean Used?
        ✅ Conditional Statements (if-else)
        ✅ Loop Conditions (while, for)
        ✅ Flags in Programs (e.g., isLoggedIn, isComplete)
        ✅ Boolean Expressions (&&, ||, !)
      */



//these were the primitive datatypes.

}

/* 
Java Data Types: Primitive & Non-Primitive (Detailed Explanation)
Java is a statically typed language, meaning every variable must have a declared type before use. Data types in Java define the kind of values a variable can store.

🔹 Categories of Data Types in Java
Java has two main types of data types:
1️⃣ Primitive Data Types (Store simple values directly in memory)
2️⃣ Non-Primitive Data Types (Reference types that store memory addresses)

1️⃣ Primitive Data Types (Built-in)
Primitive data types are the most basic data types in Java. They directly store values and do not require objects.

Data Type	    Size	    Default Value	    Range
byte	        1 byte	    0	                -128 to 127
short	        2 bytes	    0	                -32,768 to 32,767
int         	4 bytes 	0	                -2,147,483,648 to 2,147,483,647
long	        8 bytes	    0L	                -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	        4 bytes	    0.0f	             6-7 decimal digits
double	        8 bytes	    0.0d	             15-16 decimal digits
char	        2 bytes	    '\u0000'	         0 to 65,535 (Unicode characters)
boolean	        1 bit	    false	             true or false



✅ Use boolean for logical values (isAvailable, isActive).
✅ Use char for single characters ('A', '$', Unicode letters).
✅ Do NOT use boolean for integer values (1 and 0). Java does not allow boolean isTrue = 1; like C++.
✅ Do NOT use char for storing multiple letters (char name = 'Shiv'; ❌). Use String instead.

🔥 Use the right data type for the right purpose! 🚀
*/
}
