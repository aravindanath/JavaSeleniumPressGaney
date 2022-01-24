package day6;

import com.github.javafaker.Faker;
import day3.Generic;

import java.util.Locale;

public class TestDataGeneration {


    public static void main(String[] args) {

        System.out.println(Generic.fullname());
        System.out.println(Generic.emailsIds());

//        Faker faker = new Faker(new Locale("en-IND"));
//        String fn = faker.name().fullName();
//        System.out.println(fn);

    }

}
