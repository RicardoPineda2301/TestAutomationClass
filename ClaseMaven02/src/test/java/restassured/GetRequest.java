package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.reset;

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

    @Test
    public void countUsernamesThatcontainNumberTwo(){
        RestAssured.baseURI = "http://localhost:5001";
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/users/all")
                .then()
                .extract().response();

        JSONArray userList = new JSONArray(response.asString());

        int contador = 0;

        for (int i =0; i < userList.length(); i++){
            JSONObject jsonObject = userList.getJSONObject(i);
            String username = jsonObject.getString("username");
            if (username.contains("2")) contador++;
        }
        System.out.println("El numero de usuario que contienen el numero dos es: " + contador);
    }


}
