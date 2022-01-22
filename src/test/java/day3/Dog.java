package day3;

public class Dog extends Kennal implements Animal,Veternery {
    @Override
    public void fur() {
        System.out.println("Dog has fur");
    }

    @Override
    public void tail() {
        System.out.println("Dog has tail");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.fur();
        dog.tail();
        dog.sound();
        dog.vaccaination();
        dog.kennal();
    }

    @Override
    public void vaccaination() {
        System.out.println("Rabies vaccination");
    }
}
