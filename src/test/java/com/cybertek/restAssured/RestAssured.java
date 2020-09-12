package com.cybertek.restAssured;


import com.cybertek.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RestAssured {

    public static String generateToken(){
        Response response =
                given().contentType(ContentType.URLENC).formParam("email","librarian69@library")
                        .formParam("password","KNPXrm3S").
                        when().post("http://library1.cybertekschool.com/rest/v1/login");
        String token = response.path("token");
        return token;
    }

    public static Response getAllSpartans(String username, String password){
        Response response =
        given().auth().basic(username,password).
                when().get(ConfigurationReader.getProperty("spartanBaseURL"));
        return response;


    }
}
