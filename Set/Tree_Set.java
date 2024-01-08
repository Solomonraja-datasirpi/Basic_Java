package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set {

    public static void main(String[] args) {

         // its store the data in the way of natural sorting method
        // can not store duplicate data
        
        TreeSet myuse = new TreeSet<>();
        myuse.add(5);
        myuse.add(9);
        myuse.add(4);
        myuse.add(6);
        myuse.add(5);
        myuse.add(80);
        myuse.add(9);

        Iterator iterator = myuse.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}
