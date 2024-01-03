package Operators;

import java.util.Scanner;

public class Operators {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();



        //int a = 10;
        //int b = 20;

        //Logical operator

        System.out.println(a==10 && b==20);
        System.out.println(a ==10 || b==35);
        System.out.println(!(b==30));

        //arimetic operator

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a+b);
        System.out.println(a+b);
        System.out.println(a%b);

        //comparision operator

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a == b);
        System.out.println(a != b);

        //assignment operator

        System.out.println(b = b+10);
        System.out.println(b +=10);
        System.out.println(b -=10);

        

    }
    
}
