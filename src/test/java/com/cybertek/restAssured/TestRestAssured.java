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

        }

}



