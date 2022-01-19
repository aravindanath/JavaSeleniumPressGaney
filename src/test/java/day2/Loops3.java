package day2;

public class Loops3 {

    public static void main(String[] args) {


        String names[] = {"Arvind","Tony","Raj","aadvik"};

//        System.out.println(names[1]);
//
//        for(int i=0;i<names.length;i++){
//            System.out.println(i + " "+names[i]);
//        }


        for(String ref :names ){
            System.out.println(ref);
        }

    }
}
