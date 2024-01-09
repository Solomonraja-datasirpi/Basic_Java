package Comparable_Comparator;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;


public class comparator_example {
    public static void main(String[] args) {

        ArrayList mycourse = new ArrayList<>();
        mycourse.add(new course("java",10000,"30 days"));
        mycourse.add(new course("c",6000,"20 days"));
        mycourse.add(new course("python",8000,"25 days"));

        Collections.sort(mycourse,new Name());

        System.out.println("Sorting by name...");

        Iterator itr = mycourse.iterator();
        while (itr.hasNext()) {
            course a = (course) itr.next();
            System.out.println(a.Name +""+ a.duration +""+ a.fees);
            
        }

        System.out.println("Sorting by age...");
        Collections.sort(mycourse,new fees());

        Iterator itr1 = mycourse.iterator();
        while (itr1.hasNext()) {
            course a = (course) itr1.next();
            System.out.println(a.Name +""+ a.duration +""+ a.fees);
            
        }
    }
    
}

class course {
    String Name;
    int fees;
    String duration;
    public course(String name, int fees, String duration) {
        this.Name = name;
        this.fees = fees;
        this.duration = duration;
    }
    
}

class Name implements Comparator{

    public int compare(Object o1,Object o2){

        course c1 = (course) o1;
        course c2 = (course) o2;
        return c1.Name.compareTo(c2.Name);

    }

}
class fees implements Comparator{

    public int compare(Object o1,Object o2){

        course c1 = (course) o1;
        course c2 = (course) o2;

        if (c1.fees ==c2.fees) {
            return 0;
        }else if(c1.fees > c2.fees){
            return 1;
        }else{
            return 0;
        }

    }

}
