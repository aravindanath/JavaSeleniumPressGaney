package day1;

public class CastingExample2 {

    public static void main(String[] args) {


        CastingExample2 cal = new CastingExample2();
        System.out.println(cal.generatePin());

    }

    public int generatePin(){
        double d =   Math.random();
        int x = (int) (d*12345);
        return x;
    }

}
