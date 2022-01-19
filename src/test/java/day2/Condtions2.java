package day2;

import java.util.Scanner;

public class Condtions2 {


    public static void main(String[] args) {


        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter ur marks");
        int mark = sc.nextInt();

        if(mark<35){
            System.out.println("Fail");
        }else if(mark>=35 && mark <50){
            System.out.println("Pass class");
        }else if(mark>=50 && mark<65){
            System.out.println("Second class");
        }else if(mark>=65 && mark<85){
            System.out.println("First class");
        }else if(mark>=85 && mark<=100){
            System.out.println("Top class");
        }else{
            System.out.println("Contact admin");
        }



    }
}
