package Inheritance;

public class Inheritance {

    public static void main(String[] args) {

        C mytest = new C();
        int c=mytest.a+mytest.c+mytest.s;
        System.out.println(c); 

        E mytest1 = new E();
        System.out.println(mytest1.u+mytest.b);
        
    }

}

class A{ //super class
    int a =10;
    int b =20;
} 

//single inheritance

class B extends A{  //subclass
    int c=20;
    int d=30;

}
//Multilevel inheritance
class C extends B{
    int e = 40;
    int s = 60;
}
//Hierarchical inheritance
class E extends A{
    int u=39;
    int w=21;
}