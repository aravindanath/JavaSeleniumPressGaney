package day2;

public class LocalGlobal {

    // Global var
    String city = "Bangalore";


    public void admission(String name, String sub){
        //Local
        String collage = "Christ";

        System.out.println("Name is "+ name);
        System.out.println("Subject is "+ sub);
        System.out.println("Collage is "+ collage);
        System.out.println("City is "+ city);

    }

    public static void main(String[] args) {

        LocalGlobal lg = new LocalGlobal();
        lg.admission("Arvind","java");
    }
}
