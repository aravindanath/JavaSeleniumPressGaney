package day4;

public class ArrayEample2 {

    public static void main(String[] args) {


        String []str = {"Arvind","Sakti"};
        Object [] name = new Object[4];
        name[0]="Arvind";
        name[1]=1134;
        name[2]=23432.33f;
        name[3]='c';


        System.out.println(name.length);

        for(Object obj : name){
            System.out.println(obj);
        }
    }
}
