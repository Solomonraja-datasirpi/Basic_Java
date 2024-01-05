package Final;

public class Final {

    public static void main(String[] args) {
        A obj = new A();
        obj.main();
        B use = new B();
        use.use();

        
    }
    
}

//can't able inherit the final class

final class A {
    void main(){
        int a = 100;
        System.out.println(a);
    }
}
//can't able to override the final method
class B {
    final void use(){
        int a = 1000;
        System.out.println(a);
    }
}



