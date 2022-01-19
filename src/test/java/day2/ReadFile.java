package day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class ReadFile {

    public static void main(String[] args) throws  Exception{


        String path = System.getProperty("user.dir")+ File.separator+"Names.txt";

        BufferedReader br = new BufferedReader(new FileReader(path));

//        for(int i=1;i<=8;i++){
//            System.out.println( br.readLine());
//        }


        String x ="";

        while ((x = br.readLine())!=null){
            System.out.println(x);
        }


    }
}
