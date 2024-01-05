package Polymorphism;

public class Polymorphism {


    /*two types of polymorphism 
     * 1.static -method overload
     * 2.dynamic -method override
    */

    public static void main(String[] args) {

        C obj = new C();
        B objB = new B();
        A objA = new A();
        objA.values();
        objB.values();
        obj.values();

        
    }
    
}

// dynamic polymorphism

class A{
    void values(){
        int a=5;
        int b=5;
        System.out.println(a+b);
    }
}
class B extends A{
    @Override
    void values(){
        int a=10;
        int b=5;
        System.out.println(a+b);
    }
}
class C extends B{
    @Override
    void values(){
        int a=5;
        int b=50;
        System.out.println(a-b);
    }
}
