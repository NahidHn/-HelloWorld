
package helloworld;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("1. Show all student");
        System.out.println("2. Show random student");
        System.out.println("3. Show number of  students");
        System.out.println("4. add a student");
        System.out.println("5. find a student");
        
        Scanner sc = new Scanner(System.in);
        
        int option = sc.nextInt();
        
        System.out.println("enter optionb (1-5):");
        if(option == 1){
            File file = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\HelloWorld");
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException ex) {
                System.out.println("Exception : "+ex.toString());
            }
            String st;
            while((st = br.readLine())!= null){
                System.out.println("st");
            }
        }
       else if(option==2){
            
        }
       else if(option==3){
            File file = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\HelloWorld");
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException ex) {
                System.out.println("Exception : "+ex.toString());
            }
            String st;
            int count = 0;
            while((st = br.readLine())!= null){
                count = count+1;
                System.out.println("st");
            }
            System.out.println(count);
        }
       else if(option==4){
            
        }
       else if(option==5){
            
        }
    }
    
}
