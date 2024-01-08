package Map;

import java.util.*;

public class Tree_Map {

    public static void main(String[] args) {
        Map myuse = new TreeMap<>();

        myuse.put("Apple", 10);
        myuse.put("orange", 25);
        myuse.put("grapes", 15);
        myuse.put("pineapple", 12);

        for(Object key : myuse.keySet()){
            System.out.println(key + ":" + myuse.get(key));
        }
    }
    
}
