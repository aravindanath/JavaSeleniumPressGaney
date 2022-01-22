package day3;

public class ExampleThisKeyword {

    final String collage = "Christ";
     String city = "Hyd";

    public void temp(){

        this.city = "Bangalore";
        System.out.println("City "+ city);

    }

    public static void main(String[] args) {
        ExampleThisKeyword w = new ExampleThisKeyword();
        System.out.println(w.city);
        w.temp();
        System.out.println(w.city);
    }

}
