package Default;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static files.ReusableMethods.getSessionKEY;
import static files.ReusableMethods.rawToJson;
import static io.restassured.RestAssured.given;

public class basicJiraAPITest3 {

    @Test
    public void testJiraComment(){
        RestAssured.baseURI= "http://localhost:8080";
        Response res=given().header("Content-Type", "application/json").
                header("Cookie","JSESSIONID="+getSessionKEY()).
                body("{\n" +
                        "    \"body\": \"Update Existing Comment Through REST API with Automation\",\n" +
                        "    \"visibility\": {\n" +
                        "        \"type\": \"role\",\n" +
                        "        \"value\": \"Administrators\"\n" +
                        "    }\n" +
                        "}").when().
                put("/rest/api/2/issue/10028/comment/10022").then().statusCode(200).extract().response();
        JsonPath js= rawToJson(res);
        String id=js.get("id");
        System.out.println(id);
    }
}
