package List;
import java.util.*;

public class Array_List {

    public static void main(String[] args) {

        // create object for arraylist

        ArrayList mylist = new ArrayList();

        // add data to arraylist

        mylist.add(12);
        mylist.add(13);
        mylist.add(15);
        mylist.add(11);
        System.out.println(mylist); //dispaly the arraylist data

        System.out.println(mylist.get(2)); //dispaly the mentioned index

        System.out.println(mylist.size());  //dispaly the length of array list

        System.out.println(mylist.set(0, 100)); //update the data in mentioned index

        //sorting method

        Collections.sort(mylist);

        System.out.println(mylist);

        Collections.sort(mylist,Collections.reverseOrder());

        System.out.println(mylist);

        //using iterator method to display the data
        
        Iterator i = mylist.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        

    
}
}