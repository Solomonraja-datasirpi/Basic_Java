package Comparable_Comparator;

import java.util.*;
import java.lang.*;

import javax.sound.sampled.SourceDataLine;

class Students implements Comparable<Students> {

    String Name;
    int Age;

    public Students(String name, int age) {
        Name = name;
        this.Age = age;
    }

    public int compareTo(Students o) {

        //return this.Name.compareTo(o.Name);
        if (Age == o.Age)
            return 0;
        else if (Age > o.Age)
            return 1;
        else
            return -1;
    }
}
public class comparable_example {

    public static void main(String[] args) {
        ArrayList<Students> mylist = new ArrayList<>();

        mylist.add(new Students("solomon",25));
        mylist.add(new Students("Raja",25));
        mylist.add(new Students("sachin",24));

        Collections.sort(mylist);

        for (Students student : mylist) {
        
            System.out.println(student.Name +student.age);

        }
    }

    


}
