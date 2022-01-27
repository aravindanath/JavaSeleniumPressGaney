package RestAssured_Day1;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PostRequest_3 {

    @Test
    public void post(){
        RestAssured.baseURI="http://localhost";
        RestAssured.port = 8888;
        RestAssured.basePath ="student";


        JSONObject obj = new JSONObject();
        obj.put("firstName","Teju");
        obj.put("lastName","nagabushan");
        obj.put("email","nagabushan@massaQuisqueporttitor.org");
        obj.put("programme","Computer science");

        JSONArray jsonArray = new JSONArray();
        jsonArray.put("Pyhton");
        jsonArray.put("Java");
        jsonArray.put("C#");

        obj.put("courses",jsonArray);







      Response response =  given().contentType(ContentType.JSON).body(obj.toString()).log().all().post();

       response.prettyPrint();

       System.out.println("Status Code "+response.getStatusCode());


    }
}
