package trello;

import org.apache.http.HttpStatus;
import org.junit.Test;
import trello.model.Board;
import trello.utils.Constants;

import static io.restassured.RestAssured.given;

public class BoardTestSuite extends BaseTestSuite {


    @Test
    public void getAllBoards(){

        java.util.List<Board> boardList =
                given(headers).
                        get(Constants.MEMBERS+"/"+ Constants.TRELLO_USER_NAME+
                                Constants.BOARDS).
                        then().log().body().
                        statusCode(HttpStatus.SC_OK).
                        extract().response().jsonPath().getList("",Board.class);

        System.out.println("My trello boards number: "+ boardList.size());
    }

    @Test
    public void getBoardById(){
        Board myBoard=
                given(headers).
                        get(Constants.BOARDS+"/"+ BOARD_ID).
                        then().log().body().
                        statusCode(HttpStatus.SC_OK).
                        extract().response().as(Board.class);

        System.out.println("Search my boardID: "+ BOARD_ID +" "+ myBoard.getName());
    }
    @Test
    public void postNewBoard(){

        String newBoardName= "TestingBoard";
        String body = "{\"name\":\"" + newBoardName + "\"}";

        Board newBoardCreated=
                given(headers).
                        body(body).
                        when().
                        post(Constants.BOARDS).
                        then().log().body().
                        statusCode(HttpStatus.SC_OK).extract().response().as(Board.class);

        System.out.println("New board: "+ newBoardName + " and id is: "+ newBoardCreated.getId());
    }
}
