package File_Handling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Operation {

    static File file = new File("solomon.txt");
    public static void main(String[] args) {
        case1();
        case2();
        case3();
        case4();
        //case5();
    }

    //create a new file if not
    public static void case1(){

        try {
        
        if(file.createNewFile()){       
            System.out.println("created");
        }else{
            System.out.println("Already created");
        }
    } catch (IOException e) {
        System.out.println("error");
    }
    }

    //write into the file
    public static void case2(){

        try {
            FileWriter fileWriter=new FileWriter("solomon.txt");
            fileWriter.append("Good morning solomon");
            fileWriter.close();
            System.out.println("Added");
        } catch (IOException e) {
            System.out.println("error");   
        }
    }

    //Read from the file
    public static void case3(){

        try {

            Scanner input = new Scanner(file);
           while(input.hasNextLine()) {
               System.out.println(input.nextLine()); 
            }
    } catch (IOException e) {
        System.out.println("error");
    }

    }
    // get info about the file
    public static void case4(){

        try {

            if (file.exists()) {
                System.out.println(file.getAbsolutePath());
                System.out.println(file.canWrite());
                System.out.println(file.canRead());
                System.out.println(file.length());
                System.out.println(file.getName());
            }else{
                System.out.println("Not created");
            }

    } catch (Exception e) {
        System.out.println("error");
    }

    }

    //delete the file

    public static void case5(){

        try {

           file.delete();
           System.out.println("deleted");

    } catch (Exception e) {
        System.out.println("error");
    }

    }
    
}
