package day2;

import java.util.Scanner;

public class GetAsciiCode {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any char");

        char ch = sc.nextLine().charAt(0);

        int asciiValue = (int) ch;

        System.out.println("ASCII Code of the given char is "+ asciiValue);

    }
}
