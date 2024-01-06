package File_Handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Stream {

    /*streams consists two types
     * 1.byte stream --> fileinput class,fileoutput class
     * 2.charater stream -->file reader,filewriter
     */

    public static void main(String[] args) {
        case1();
        case2();
        case3();
        case4();
        
    }
// fileinput class
    public static void case1(){
        try {
            FileInputStream input = new FileInputStream("solomon.txt");
            int i;
            while ((i = input.read()) != -1) {
                System.out.println((char) i);
               
            }
             input.close();
            

        } catch (Exception e) {
            System.out.println("error");
        }
    }
// fileoutput class
    public static void case2(){
        try {
            FileOutputStream output = new FileOutputStream("solomon.txt");
            String s ="Do your best";
            byte[] value = s.getBytes();
            output.write(value);
            System.out.println("success");
            output.close();

        } catch (Exception e) {
            System.out.println("error");
        }
    }
// filewriter class
    public static void case3(){
        try {
            
            FileWriter output = new FileWriter("solomon.txt");
            String s ="Do your best";
            //byte[] value = s.getBytes();
            output.write(s);
            System.out.println("success");
            output.close();

        } catch (Exception e) {
            System.out.println("error");
        }
    }
// filereader class
    public static void case4(){
        try {
            FileReader input = new FileReader("solomon.txt");
            int i;
            while ((i = input.read()) != -1) {
                System.out.println((char) i);
               
            }
             input.close();
            

        } catch (Exception e) {
            System.out.println("error");
        }
    }


    
}
