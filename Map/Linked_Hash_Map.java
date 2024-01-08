package Map;

import java.util.*;

public class Linked_Hash_Map {

    public static void main(String[] args) {

        Map myuse = new LinkedHashMap<>();

        myuse.put("Name", "Solomon");
        myuse.put("Age", 25);
        myuse.put("Place", "Nagercoil");

        for(Object key : myuse.keySet()){
            System.out.println(key + ":" + myuse.get(key));
        }



    }
    
}
