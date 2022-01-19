package day2;

import java.util.function.Supplier;

public class StaticKeyword {

    // Global var
    static  String city = "Bangalore";



    public static void main(String[] args) {
        System.out.println(city);
        pollution();

        StaticKeyword sk = new StaticKeyword();
        sk.temp();

//        StaticKeyword sw = new StaticKeyword();
//        System.out.println(sw.city);
    }
    // static method
    public static void pollution(){
        System.out.println("City "+ city);
    }

    // non static method
    public void temp(){
        System.out.println("Temp");
    }
}
