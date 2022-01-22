package day3;

public interface Animal {


    void fur();
    void tail();

    default void sound(){
        System.out.println("Sound");
    }
}
