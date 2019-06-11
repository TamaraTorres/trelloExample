package trello;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;
import org.junit.Test;
import trello.model.Board;
import trello.model.List;

import static io.restassured.RestAssured.given;

public class TrelloTests {


    static RequestSpecification headers;

    public static String BOARD_ID= "YOUR BOARD ID";
    public static String LIST_ID= "YOUR LIST ID";

    @BeforeClass
    public  static void setup()
    {
        RestAssured.defaultParser = Parser.JSON;
        headers= new RequestSpecBuilder().
                setBaseUri(TrelloConstants.BASE_URI).
                addHeader("Content-Type", ContentType.JSON.toString()).
                addQueryParam("key", TrelloConstants.TRELLO_API_KEY).
                addQueryParam("token", TrelloConstants.TRELLO_TOKEN).
                build();
    }
    @Test
    public void getAllBoards(){

        java.util.List<Board> boardList =
                given(headers).
                        get(TrelloConstants.MEMBERS+"/"+TrelloConstants.TRELLO_USER_NAME+
                                TrelloConstants.BOARDS).
                        then().log().body().
                        statusCode(200).
                        extract().response().jsonPath().getList("",Board.class);

        System.out.println("My trello boards number: "+ boardList.size());
    }

    @Test
    public void postNewBoard(){

        String newBoardName= "TESTING11";
        String body = "{\"name\":\"" + newBoardName + "\"}";

        Board newBoardCreated=
                given(headers).
                        body(body).
                        when().
                        post(TrelloConstants.BOARDS).
                        then().log().body().
                        statusCode(200).extract().response().as(Board.class);

        System.out.println("New board: "+ newBoardName + " and id is: "+ newBoardCreated.getId());
    }

    @Test
    public void postList(){
        String newListName= "TODO3";
        String body = "{\"name\":\"" + newListName + "\"}";

        List newListCreated=
                given(headers).
                        queryParam("idBoard",BOARD_ID).
                        body(body).
                        when().
                        post(TrelloConstants.LISTS).
                        then().log().body().
                        statusCode(200).extract().response().as(List.class);

        System.out.println("New List: "+ newListCreated.getName() + " and id is: "+ newListCreated.getId());
    }

    @Test
    public void postCard(){
        String newCardName= "Card01";
        String body = "{\"name\":\"" + newCardName + "\"}";

        Response response =given(headers).
                        queryParam("idList",LIST_ID).
                        body(body).
                        when().
                        post(TrelloConstants.CARDS).
                        then().log().body().
                        statusCode(200).extract().response();

        System.out.println("New Card: "+ response.jsonPath().get("name")+ " and id is: "+ response.jsonPath().get("id"));

    }

}
