package loops_and_stream_collection;

import java.util.ArrayList;
import java.util.*;

public class loops_collection {

    public static void main(String[] args) {

        //collection

        List<Integer> mylist = Arrays.asList(1,3,6,9,12);

        System.out.println(mylist.size());
        Collections.sort(mylist);


        // Forloop

        for(int i=0;i<mylist.size();i++){
            System.out.println(i + ":" +mylist.get(i));
        }

        //for each loop

        for (Object a: mylist) {
            System.out.println(a);
            
            
        }

    }
    
}
