package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hash_Set {

    public static void main(String[] args) {

        // its store the data in hashing method but the output in order
        // can not store duplicate data

        LinkedHashSet myuse = new LinkedHashSet<>();
        myuse.add("solomon");
        myuse.add(12);
        myuse.add(456);

        System.out.println(myuse);

        Iterator iterate = myuse.iterator();

        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }

        
    }
    
}
