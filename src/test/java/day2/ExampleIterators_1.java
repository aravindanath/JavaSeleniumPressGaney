package day2;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleIterators_1 {


    public static void main(String[] args) {


        ArrayList<String> li = new ArrayList<String>();
        li.add("Arvind");
        li.add("Gyan");
        li.add("Tony");
        li.add("Shiva");

       Iterator it =  li.iterator();

       while (it.hasNext()){

           System.out.println(it.next());
       }




    }
}
