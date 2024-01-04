package Method;

public class Method {

    public static void main(String[] args) {

        

        add();
        add(25);
        add(2,2);
        add(2,2,8);
        
    }

    // method

    static void add(){
        int a=5;
        int b=5;
        int c=a+b;
        System.out.println(c);
    }

    //method overloading

    //multiple methods can have the same name with different parameters

    static void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    static void add(int a,int b,int c){
        int d=a+b+c;
        System.out.println(d);
    }

    static void add(int a){
        System.out.println(a);
    }
    
}
