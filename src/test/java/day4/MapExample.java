package day4;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {


        HashMap<Integer, String> emp = new HashMap<>();
        emp.put(101, "Tony");
        emp.put(102, "Aadvik");
        emp.put(103, "Raj");
        emp.put(104, "Kunar");
        emp.put(105, "Raji");
        emp.put(null,"Arvind");


//        System.out.println(emp.get(null));

        for(Map.Entry<Integer, String> ref : emp.entrySet()){
            System.out.println(ref);
        }

    }
}
