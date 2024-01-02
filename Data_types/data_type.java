package Data_types;

import java.util.Arrays;

public class data_type{
    public static void main(String args[])
    {

        /* It consists two types of Datatypes, 1. primitive datatype 2.non-primitive datatype*/

        System.out.println("Primitive data type"+"\n");

        /*In primitive datatypes consists 8 types, they are listed below */

        byte a =100;
        short b =1000;
        int c =100000;
        long d =10000000L;
        float e =11.5f;
        double f =11.9999;
        char g ='s';
        boolean h = true;

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