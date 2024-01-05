package Interface;

public class Interface {

    public static void main(String[] args) {

        B obj = new B();
        obj.case1();
        obj.case2();
        
    }
}
interface A{
        abstract void case1();
    }

    interface C{
        abstract void case2();

    }
    class B implements A, C{
        public void case1(){
            System.out.println("solomon");
        }

        public void case2(){
        
            System.out.println("Raja");
        }
    }
   