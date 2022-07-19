package _2_FilesOperations;
import java.io.*;
import java.util.*;

// created by Marcin 
public class PayrollSheet {
        public static void main(String args[]) throws FileNotFoundException {

            File f = new File("payroll.txt");
//            System.out.println(f.exists());
                ReadMe(f);

        }
        public static void ReadMe(File f) throws FileNotFoundException{
            int totalSum = 0;
            Scanner file = new Scanner(f);
            while(file.hasNext()){
                String name = file.next();
                int sum = 0; 
                while(file.hasNextInt()){
                    sum += file.nextInt();
                }
                //System.out.printf("Total hour for %s = %d\n",name,sum);
                totalSum = totalSum + sum;
            }System.out.println("Total hour for all workers in this week are = " + totalSum);
        }
        
}

