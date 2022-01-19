package day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ExampleIterators_2 {


    public static void main(String[] args) {


        ArrayList<String> li = new ArrayList<String>();
        li.add("Arvind");
        li.add("Gyan");
        li.add("Tony");
        li.add("Shiva");

       ListIterator it =  li.listIterator();

       while (it.hasNext()){

           System.out.println(it.next());
       }

       System.out.println("***********");

       while (it.hasPrevious()){
           System.out.println(it.previous());
       }


    }
}
