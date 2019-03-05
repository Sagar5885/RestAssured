package Default;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static files.ReusableMethods.rawToJson;
import static files.payload.getPostData;
import static files.resources.deleteData;
import static files.resources.postData;
import static io.restassured.RestAssured.given;

public class basic3 {
    Properties props = new Properties();

    @BeforeTest
    public void getData() throws IOException {

        FileInputStream fis = new FileInputStream("/Users/sdodia/Projects/RestAssuredProject/src/files/env.properties");
        props.load(fis);
        props.get("HOST");
    }

    @Test
    public void AddandDelete(){
        //String b = "{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";

        RestAssured.baseURI= props.getProperty("HOST");
        Response res = given().
                body(getPostData()).
                when().
                post(postData()).
                then().assertThat().statusCode(200).
                extract().response();

        System.out.println(res.asString());

        //JsonPath json = new JsonPath(res.asString());
        JsonPath json = rawToJson(res);
        String id = json.get("id");

        System.out.println(id);

        given().when().delete(deleteData()+id).then().
                assertThat().statusCode(200);
    }
}
