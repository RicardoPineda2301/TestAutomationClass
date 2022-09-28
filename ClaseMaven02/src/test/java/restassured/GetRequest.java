package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRequest {

    @Test
    public void getAllUsers(){
        RestAssured.baseURI = "http://localhost:5001";

        Response response = given().contentType(ContentType.JSON)
        .when()
        .get("users/all")
        .then()
        .extract()
        .response();

        System.out.println(response.getBody().prettyPrint());
    }

    @Test(description = "Poke API")
    public void getPokemonByName(){
        RestAssured.baseURI = "https://pokeapi.co/api/v2/";

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("pokemon/articuno")
                .then()
                .extract().response();

        System.out.println(response.getBody().prettyPrint());
    }


}
