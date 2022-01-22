package day3;

public class ExamplePoly {

    public static void main(String[] args) {

        RBI rbi;

        rbi = new SBI();
        System.out.println("SBI Rate of INT "+ rbi.getInterest());


        rbi = new ICICI();
        System.out.println("ICICI Rate of INT "+ rbi.getInterest());

        rbi = new Axix();
        System.out.println("AXIS Rate of INT "+ rbi.getInterest());


    }
}
