package trello;

import org.apache.http.HttpStatus;
import org.junit.Test;
import trello.model.List;
import trello.utils.Constants;

import static io.restassured.RestAssured.given;

public class ListTestSuite extends  BaseTestSuite {
    @Test
    public void postList(){
        String newListName= "TestingList";
        String body = "{\"name\":\"" + newListName + "\"}";

        List newListCreated=
                given(headers).
                        queryParam(Constants.BOARD_ID,BOARD_ID).
                        body(body).
                        when().
                        post(Constants.LISTS).
                        then().log().body().
                        statusCode(HttpStatus.SC_OK).extract().response().as(List.class);

        System.out.println("New List: "+ newListCreated.getName() + " and id is: "+ newListCreated.getId());
    }
}
