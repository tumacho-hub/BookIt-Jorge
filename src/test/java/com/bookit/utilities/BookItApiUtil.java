package com.bookit.utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BookItApiUtil {
    //because we are doing something repetitive as steds we will simplify our code by creating a method that will
    // generate and return our token back

    public static String generateToken(String email, String password) {
        Response response = given().accept(ContentType.JSON)
                .queryParam("email", email)
                .queryParam("password", password)
                .when().get(ConfigurationReader.get("qa3api.url") + "/sign");
        //this is how you retrieve the token from the query but make no sense to  keep it inside our step
        // definition because we need access it from anywhere so will make it instance variable

        String token = response.path("accessToke");
        String finalToken ="bearer "+ token;
        return finalToken;


    }
}
