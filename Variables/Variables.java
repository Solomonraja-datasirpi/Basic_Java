package Variables;

public class Variables {

    int a = 10; //Instance variable

    static int b = 20; //static variable

    public static void main(String[] args) {

        int c = 30; //local variable

        System.out.println(c);

        System.out.println(b);

        System.out.println(Variables.b);    //without creating an object, we can call with static variables

        Variables myuse = new Variables();
        System.out.println(myuse.a);
        
    }
    
}
