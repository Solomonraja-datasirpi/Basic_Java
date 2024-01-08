package Map;

import java.util.*;

public class Hash_Map {

    public static void main(String[] args) {


        Map myuse = new HashMap<>();
        myuse.put("Name", "Solomon");
        myuse.put("Age", 25);
        myuse.put("Place", "Nagercoil");

        for(Object key:myuse.keySet()){
            System.out.println(key); //display the key data
            System.out.println(myuse.get(key)); //display the value data
            System.out.println(key +":"+ myuse.get(key));//display the both key:value data
            System.out.println(myuse.containsValue("Solomon")); //check the availability
        }

        HashMap myuse1 = new HashMap<>();
        myuse1.put("Name", "Aswin");
        myuse1.put("Age", 25);
        myuse1.put("Place", "Nagercoil");
        for(Object key:myuse1.keySet()){
            System.out.println(key); //display the key data
            System.out.println(myuse1.get(key)); //display the value data
            System.out.println(key +":"+ myuse.get(key));//display the both key:value data
            System.out.println(myuse1.containsValue("Solomon")); //check the availability
        }


    }
    
}
