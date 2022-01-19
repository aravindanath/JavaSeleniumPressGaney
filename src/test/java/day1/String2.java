package day1;

public class String2 {

    public static void main(String[] args) {

        String name = "Arvind";

        System.out.println(name.equals("Arvind"));
        System.out.println(name.equalsIgnoreCase("ArVInd"));
        System.out.println(name.contains("ind"));
        System.out.println(name.startsWith("Arv"));
        System.out.println(name.endsWith("ind"));
    }
}
