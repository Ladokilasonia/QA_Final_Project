package org.example.api_tests;

import io.qameta.allure.Allure;
import io.restassured.response.Response;
import org.example.api.ApiClient;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UserApiTests {

    @Test
    public void getAllProductsTest() {
        Response response = ApiClient.getAllProducts();
        Allure.addAttachment("Response", response.asPrettyString());
        assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void verifyLoginInvalidUser() {
        Response response = ApiClient.verifyLogin("fake@mail.com", "wrong");
        Allure.addAttachment("Response", response.asPrettyString());
        assertEquals(response.getStatusCode(), 200);
    }
}
