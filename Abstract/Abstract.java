package Abstract;

public class Abstract {

    public static void main(String[] args) {

        B obj = new B();
        obj.values(10, 23);
        obj.testing(3, 8);
        
    }
    
}

abstract class A{       //abstract class

    void values(int a,int b){

        System.out.println(a+b);
        
    }
    abstract void testing(int a, int b);        //abstract method

}

class B extends A{

    void testing(int a, int b){
        System.out.println(a*b);
    }

}
