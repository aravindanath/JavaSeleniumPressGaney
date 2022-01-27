package RestAssured_Day1;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class PostRequest_2 {

    @Test
    public void post(){
        RestAssured.baseURI="http://localhost";
        RestAssured.port = 8888;
        RestAssured.basePath ="student";

        String path = System.getProperty("user.dir")+ File.separator+"data"+File.separator+"newstudent.json";

        File file = new File(path);

       Response response =  given().contentType(ContentType.JSON).body(file).log().all().post();

       response.prettyPrint();

       System.out.println("Status Code "+response.getStatusCode());


    }
}
