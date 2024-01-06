package Exceptions;

import java.util.Scanner;


public class Exception_Handling {

    public static void main(String[] args) {

        // exception handling
        try{
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a/b);;
        }catch(Exception e){
            System.out.println("0 is not acceptable");
        }
        finally{
            System.out.println("Thank you");
        }
        
    }

    
    
}
