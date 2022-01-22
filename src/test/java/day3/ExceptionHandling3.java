package day3;

import javax.naming.NameAlreadyBoundException;
import java.io.FileInputStream;

public class ExceptionHandling3 {


    public static void main(String[] args) throws Exception {

        System.out.println("Starting....");

        int amt = 50;

        if(amt>=100){
            System.out.println("Collect your cash");
        }else if(amt<100){
            throw new Exception("Enter 100 mutiples");
        }


         System.out.println("Ending....");

    }
}
