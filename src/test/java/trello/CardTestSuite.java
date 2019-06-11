package trello;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.Test;
import trello.utils.Constants;

import static io.restassured.RestAssured.given;

public class CardTestSuite extends BaseTestSuite {

    @Test
    public void postCard(){
        String newCardName= "Card01";
        String body = "{\"name\":\"" + newCardName + "\"}";

        Response response =given(headers).
                queryParam(Constants.LIST_ID,LIST_ID).
                body(body).
                when().
                post(Constants.CARDS).
                then().log().body().
                statusCode(HttpStatus.SC_OK).extract().response();

        System.out.println("New Card: "+ response.jsonPath().get("name")+ " and id is: "+ response.jsonPath().get("id"));
    }
    @Test
    public void getCardById(){
        Response myCard=
                given(headers).
                        get(Constants.CARDS+"/"+ CARD_ID).
                        then().log().body().
                        statusCode(HttpStatus.SC_OK).
                        extract().response();
        System.out.println("Search my cardID: "+CARD_ID +" "+ myCard.jsonPath().get("name"));
    }

}
