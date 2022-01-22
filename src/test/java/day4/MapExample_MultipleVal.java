package day4;

import java.util.*;


public class MapExample_MultipleVal {

    public static void main(String[] args) {


        /**
         *
         *  A = [Apple,Alphabets,Alfa]
         *  b = [Bluetooth, Bloom,]
         *
         */

        ArrayList<String> a = new ArrayList<>();
        a.add("Apple");
        a.add("Alphabets");
        a.add("Alfa");

        ArrayList<String> b = new ArrayList<>();
        b.add("Bluetooth");
        b.add("Bloom");
        b.add("Beta");


        HashMap<String, List<String>> emp = new HashMap<>();
        emp.put("A",a);
        emp.put("B",b);


        for(Map.Entry<String, List<String>> ref : emp.entrySet()){
                System.out.println(ref);
        }



    }
}
