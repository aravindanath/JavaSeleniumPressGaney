package day1;

import java.util.Scanner;

public class Operators3 {

    public static void main(String[] args) {

        Operators3 op = new Operators3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int x = sc.nextInt();
        System.out.println("Enter a num");
        int y = sc.nextInt();
        System.out.println("Enter a num");
        int z = sc.nextInt();

        op.addNumber(x,y,x);
        op.addNumber(z,z);



    }


    public void addNumber(int x, int y){
        int sum = x+y;
        System.out.println("Addition of two numbers: "+sum);
    }
    // Method overloading

    public void addNumber(int x,int y, int z){
        int sum = x+y+z;
        System.out.println("Addition of two numbers: "+sum);
    }


}
