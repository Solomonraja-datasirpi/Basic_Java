package loops_and_stream_collection;

import java.util.ArrayList;
import java.util.*;

public class loops_collection {

    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(1,3,6,9,12);

        System.out.println(mylist.size());

        for(int i=0;i<mylist.size();i++){
            System.out.println(i + ":" +mylist.get(i));
        }

        for (Object a: mylist) {

            System.out.println(mylist.get(0));
            
        }

    }
    
}
