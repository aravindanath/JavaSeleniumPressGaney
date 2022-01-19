package day1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
       int x =  calculator.addNumber(22,44);
       System.out.println(x*2323/2);

    }


    public int addNumber(int x, int y){
        int sum = x+y;
//        System.out.println("Addition of two numbers: "+sum);
        return sum;


    }


}
