package ApiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTestScript {

    @Test
    public void validationStatusCode() {
        String url ="http://localhost:8001/medicare/show/all/products";
        RestAssured.baseURI = url;
        RequestSpecification requestSpecification = RestAssured.given();
        Response res = requestSpecification.get("");
        int statusCode = res.getStatusCode();
        System.out.println("Response:");
        System.out.println(res.prettyPrint());
        System.out.println("StatusCode: "+ statusCode);
        Assert.assertEquals(statusCode,200);
    }

    @Test
    public void validationStatusCode1() {
        String url ="http://localhost:8001/medicare/show/category/2/products";
        RestAssured.baseURI = url;
        RequestSpecification requestSpecification = RestAssured.given();
        Response res = requestSpecification.get("");
        ResponseBody body = res.getBody();
        int statusCode = res.getStatusCode();
        System.out.println("StatusCode: "+ statusCode);
        Assert.assertEquals(statusCode,200);
        String bodyasString = body.asString();
        Assert.assertTrue(bodyasString.contains("Analgesics"));
    }




}
