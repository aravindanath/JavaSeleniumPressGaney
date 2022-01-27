package RestAssured_Day1;


import day3.Generic;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PostRequest_5_POJO {

    @Test
    public void post(){
        RestAssured.baseURI="http://localhost";
        RestAssured.port = 8888;
        RestAssured.basePath ="student";

        String fn = Generic.firstName(),ln =Generic.lastName(),email = Generic.emailsIds(),programe = Generic.programme();

        Student stu = new Student(fn,ln,email,programe);

        Courses courses = new Courses("Java");
        stu.setCourse(courses);





      Response response =  given().contentType(ContentType.JSON).body(stu).log().all().post();

       response.prettyPrint();

       System.out.println("Status Code "+response.getStatusCode());


    }
}
