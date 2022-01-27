package RestAssured_Day1;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PostRequest_4 {

    @Test
    public void post(){
        RestAssured.baseURI="http://localhost";
        RestAssured.port = 8888;
        RestAssured.basePath ="student";


        HashMap<String, Object> obj = new HashMap<>();
        obj.put("firstName","Teju");
        obj.put("lastName","sharma");
        obj.put("email","teju@gmail.com");
        obj.put("programme","Computer science");

        ArrayList<String> jsonArray = new ArrayList();
        jsonArray.add("Pyhton");
        jsonArray.add("Java");
        jsonArray.add("C#");

        obj.put("courses",jsonArray);







      Response response =  given().contentType(ContentType.JSON).body(obj).log().all().post();

       response.prettyPrint();

       System.out.println("Status Code "+response.getStatusCode());


    }
}
