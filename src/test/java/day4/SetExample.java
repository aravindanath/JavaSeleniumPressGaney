package day4;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {


    public static void main(String[] args) {


        HashSet<String> names = new HashSet<>();

        names.add("Arvind");
        names.add("Arvind");
        names.add("Raj");
        names.add("Ravi");

        Iterator it = names.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
//        for(String str : names){
//            System.out.println(str);
//        }


    }
}
