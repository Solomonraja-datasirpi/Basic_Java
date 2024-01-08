package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set {

    public static void main(String[] args) {
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
