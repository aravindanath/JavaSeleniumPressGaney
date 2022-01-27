package RestAssured_Day1;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRequest_1 {

    @Test
    public void post(){
        RestAssured.baseURI="http://localhost";
        RestAssured.port = 8888;
        RestAssured.basePath ="student";

       Response response =  given().contentType(ContentType.JSON).body("{\n" +
               "  \"firstName\": \"Naga\",\n" +
               "  \"lastName\": \"bushan\",\n" +
               "  \"email\": \"nagabushan@massaQuisqueporttitor.org\",\n" +
               "  \"programme\": \"Computer science\",\n" +
               "  \"courses\": [\n" +
               "    \"Java\",\n" +
               "    \"Pyhton\",\n" +
               "    \"Java Script\"\n" +
               "  ]\n" +
               "}").log().all().post();

       response.prettyPrint();

       System.out.println("Status Code "+response.getStatusCode());


    }
}
