package org.example.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiClient {

    static {
        RestAssured.baseURI = "https://automationexercise.com/api";
    }

    public static Response getAllProducts() {
        return given().when().get("/productsList");
    }

    public static Response verifyLogin(String email, String password) {
        return given()
                .formParam("email", email)
                .formParam("password", password)
                .when()
                .post("/verifyLogin");
    }
}
