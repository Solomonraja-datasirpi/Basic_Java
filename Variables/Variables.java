package Variables;


public class Variables {

    int a = 10; //Instance variable

    static int b = 20; //static variable


    // static block
    static{
        Variables.b=40;
    }

    public static void main(String[] args) {

        int c = 30; //local variable

        System.out.println(c);

        System.out.println(b);

        System.out.println(Variables.b);    //Static method --->without creating an object, we can use static variables 

        Variables myuse = new Variables();
        System.out.println(myuse.a);
        System.out.println();
        
    }
    
}
