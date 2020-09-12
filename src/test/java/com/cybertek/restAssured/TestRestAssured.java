package com.cybertek.restAssured;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;


public class TestRestAssured {

    @Test
    public void restAssuredTest() {
        Response response = RestAssured.getAllSpartans("admin",
                "admin").prettyPeek();
    }
    @Test
    public void getToken(){
        String token = RestAssured.generateToken();
        Response response = given().header("x-library-token", token)
                .when().get("http://library1.cybertekschool.com/rest/v1/get_all_users");

                response.prettyPeek();

        }

}



