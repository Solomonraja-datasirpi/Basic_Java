package Conditions;

import java.util.Scanner;

public class Condition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value for a");
        int a = input.nextInt();
        input.nextLine();
        System.out.println("Enter the value for b");
        int b=input.nextInt();
        input.nextLine();
        System.out.println("Enter the value for c");
        int c=input.nextInt();
        input.nextLine();

        

        // if,if-else,else-if condition

        if(a>b && a>c){
            System.out.println("a is big"+"\n");
        }else if(b>c){
            System.out.println("b is big"+"\n");
        }else {
            System.out.println("c is big"+"\n");
        }

        // switch condition

        System.out.println("Enter your Name");
        String name = input.nextLine();

        switch (name) {
            case "solomon":
                System.out.println("Hi" +name+"\n");
                
                break;
            case "Raja":
                System.out.println("Hi " +name+"\n");
                
                break;
        
            default:

            System.out.println("Your name is not in list"+"\n");
                break;
        }

        // for,while,do-while,for-each looping state

        int s = 5;
        for(int i=0;i<s;i++){
            System.out.println("welcome");
        }

        int i =0;
        while (i<s) {

            System.out.println("Welcome");
            i++;
            
        }
        do{
            System.out.println("Welcome");
            i++;
        }while(i<s);

        int t[]={1,2,3,4,5};

        for(int r:t){
            System.out.println(r);
        }


        //breaks and continue

        for (int m=0;m<6;m++){

            if (m == 4){
                break;
            } 
                System.out.println(m);

        }

        for (int m=0;m<6;m++){

            if (m == 4){
                continue;
            } 
                System.out.println(m);

        }   
    }
    
}
