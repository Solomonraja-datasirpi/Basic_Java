package Data_types;

import java.util.Arrays;

public class data_type{
    public static void main(String args[])
    {

        /* It consists two types of Datatypes, 1. primitive datatype 2.non-primitive datatype*/

        System.out.println("Primitive data type"+"\n");

        /*In primitive datatypes consists 8 types, they are listed below */

        byte a =100;        //Stores whole numbers from -128 to 127
        short b =1000;      //Stores whole numbers from -32,768 to 32,767
        int c =100000;      //Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long d =10000000L;  //Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float e =11.5f;     //Stores 6 to 7 decimal numbers
        double f =11.9999;  //Stores 15 decimal numbers
        char g ='s';        //Stores single charater
        boolean h = true;

            //print the values

        System.out.println(a); 
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h +"\n");


        System.out.println("non-primitive datatypes"+"\n");

        /*It consists string,arrays,..etc., */

        String i ="welcome";
        int j[] = new int[3];
        j[0] =5;
        j[1]=6;
        j[2]=7;

        System.out.println(i);
        System.out.println(j.length);
 
    }
}