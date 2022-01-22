package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling2 {


    public static void main(String[] args)  {

        System.out.println("Starting....");

    try {
        FileInputStream fis = new FileInputStream("file");
    }catch (Exception e){

    } finally {
        System.out.println("File close");
    }



         System.out.println("Ending....");

    }
}
