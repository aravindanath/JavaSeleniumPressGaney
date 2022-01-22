package day4;

import java.util.*;


public class List1 {


    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Java");//0
        list.add("Pyhton");//1
        list.add("GO lang");
        list.add("C#");
        list.add(0,"Java Script");

        ArrayList<String> li = new ArrayList<String>(list);
        li.add("Arvind");
        li.add("Tony");
        li.add("Shiv");
        li.addAll(list);

        for(String str : li){
            System.out.println(str);
        }

        li.remove(3);

        System.out.println(li.size());

        System.out.println(li.get(2));


    }
}
