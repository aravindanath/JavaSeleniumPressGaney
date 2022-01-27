package RestAssured_Day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRequest_Asserions {

    @Test
    public void get(){
        RestAssured.baseURI="http://localhost";
        RestAssured.port = 8888;
        RestAssured.basePath ="student/103";

       String  response =  given().log().all().get().then().extract().path("email");

       System.out.println(response);

//        Assert.assertEquals(response,"teju@gmail.coe");

        JSONAssert.assertEquals(response.toString(),response, JSONCompareMode.STRICT);




    }
}
