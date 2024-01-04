package Access_modifier;

public class Access_modifier {

    //pubic access modifier - code is accessible all classes

    public static void main(String args[]){

        case1();                    //calling method

        System.out.println(case2());
         //arguments
        System.out.println("success");

    }

    //private access modifier - code is only accessible within the declared class

    private static void case1(){
        System.out.println("Welcome");

    }

    private static String case2(){
        System.out.println(case3(5, 5));

        return "welcome";

    }

    //protected access modifier - code is accessible in same package and subclasses

    protected static int case3(int a,int b){  //parameters

        return a+b;

    }
    
}
