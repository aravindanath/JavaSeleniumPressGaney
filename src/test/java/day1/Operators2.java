package day1;


import java.util.Scanner;

public class Operators2 {

    public static void main(String[] args) {

        /**
         *  + - * / %
         *  ++
         *  --
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i  = sc.nextInt();
        System.out.println("Enter a number");
        int z  = sc.nextInt();

        int sum = i +z;
        int mul = i *z;
        int div = i/z;
        int mod = i%z;
        int sub = i-z;

        System.out.println("Addition of two numbers: "+sum);
        System.out.println("Mutiplicaiton of two numbers: " + mul);
        System.out.println("Division of two numbers: " + div);
        System.out.println("moduls of two numbers: " + mod);
        System.out.println("Sub of two numbers: " + sub);



    }
}
