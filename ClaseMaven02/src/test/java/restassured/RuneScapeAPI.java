package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RuneScapeAPI {
/* ID No.	Category Name
0	Miscellaneous
1	Ammo
2	Arrows
3	Bolts
4	Construction materials
5	Construction products
6	Cooking ingredients
7	Costumes
8	Crafting materials
9	Familiars
10	Farming produce
11	Fletching materials
12	Food and Drink
13	Herblore materials
14	Hunting equipment
15	Hunting Produce
16	Jewellery
17	Mage armour
18	Mage weapons
19	Melee armour - low level
20	Melee armour - mid level
21	Melee armour - high level
22	Melee weapons - low level
23	Melee weapons - mid level
24	Melee weapons - high level
25	Mining and Smithing
26	Potions
27	Prayer armour
28	Prayer materials
29	Range armour
30	Range weapons
31	Runecrafting
32	Runes, Spells and Teleports
33	Seeds
34	Summoning scrolls
35	Tools and containers
36	Woodcutting product
37	Pocket items
38	Stone spirits
39	Salvage
40	Firemaking products
41	Archaeology materials */

    int num;
    int ID;
    String letra;

    @Test(description = "Llamada General Por Categoria")
    public void Test01(){
    num = 18;
    RestAssured.baseURI = "https://services.runescape.com/m=itemdb_rs/api";

    Response response = given().contentType(ContentType.JSON)
                .when()
                .get("/catalogue/category.json?category=" + num + "")
                .then()
                .extract()
                .response();

        System.out.println("Llamada al API en : " + "https://services.runescape.com/m=itemdb_rs/api/catalogue/"  + "items.json?category=" + num + "&alpha=c&page=1");
        System.out.println(response.getBody().prettyPrint());
    }

    @Test(description = "Llamada especifica por categoria segun letra")
    public void Test02(){
        num = 18;
        letra = "s";
        RestAssured.baseURI = "https://services.runescape.com/m=itemdb_rs/api/catalogue/";

        Response response = given().contentType(ContentType.JSON)
                .when()
                .get("items.json?category=" + num + "&alpha=" + letra)
                .then()
                .extract()
                .response();

        System.out.println("Llamada al API en : " + "https://services.runescape.com/m=itemdb_rs/api/catalogue/"  + "items.json?category=" + num + "&alpha=" + letra);
        System.out.println(response.getBody().prettyPrint());
    }




    @Test(description = "Llamada especifica segun ID")
    public void Test03(){
        ID = 28617;
        RestAssured.baseURI = "https://services.runescape.com/m=itemdb_rs/api/catalogue/";

        Response response = given().contentType(ContentType.JSON)
                .when()
                .get("detail.json?item=" + ID)
                .then()
                .extract()
                .response();

        System.out.println("Llamada al API en : " + "https://services.runescape.com/m=itemdb_rs/api/catalogue/"  + "detail.json?item=" + ID);
        System.out.println(response.getBody().prettyPrint());
    }
}
