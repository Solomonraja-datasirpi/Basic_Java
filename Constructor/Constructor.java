package Constructor;

public class Constructor {

    public static void main(String[] args) {

        Course java = new Course("30 mins",1200);
        //java.duration ="30 mins";
        //java.fees;
        System.out.println("Duration for java : "+java.duration);

        Course python = new Course();
        System.out.println("Duration for Python : "+python.duration);

        Course php = new Course();
        php.duration="45 mins";
        System.out.println("Duration for Php : "+php.duration);
        
    }
    
}

class Course{
    String duration;
    int fees;

    //creating no parameterized constructor 

    Course(){
        duration = "1 hour";
        fees = 1200;
    }

    //parameterized constructor

    Course(String d,int f){
        duration = d;
        fees = f;

    }

}
