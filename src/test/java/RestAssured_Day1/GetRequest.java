package RestAssured_Day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRequest {

    @Test
    public void get(){
        RestAssured.baseURI="http://localhost";
        RestAssured.port = 8888;
        RestAssured.basePath ="student/list";

       Response response =  given().log().all().get();

       response.prettyPrint();

       System.out.println("Status Code "+response.getStatusCode());


    }
}
