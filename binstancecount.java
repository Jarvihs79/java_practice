class Innerbinstancecount {
    static int count = 0;

    void count(){
        count++;
    }
    
}

class Addition{
    int a;
    int b;

    void Add(){
        int d;

        d=a+b;
        System.out.println(d);
    }
}

public class binstancecount {
    public static void main(String[] args){

        final int ff= 5000;

       // Inneravariables c1 = new Inneravariables();
        System.out.println("count"+Innerbinstancecount.count);

        Innerbinstancecount c2= new Innerbinstancecount();
        c2.count();
        System.out.println("count"+Innerbinstancecount.count);

        Innerbinstancecount c3= new Innerbinstancecount();
        c3.count();
        System.out.println("count"+Innerbinstancecount.count);

        Innerbinstancecount c4= new Innerbinstancecount();
        c4.count();
        System.out.println("count"+Innerbinstancecount.count);


        Addition a1 = new Addition();
        a1.a = 5;
        a1.b = 24;
        a1.Add();

        System.out.println(ff);
       // ff = ff + 1; here tried to assign value to the final variable. if value once assigned to final variable it cannot be changed.
    }
}
