package trello;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;
import trello.utils.Constants;

public class BaseTestSuite {

    static RequestSpecification headers;
    public static String BOARD_ID= "YOUR BOARDID";
    public static String LIST_ID= "YOUR LIST ID";
    public static String CARD_ID="YOUR CARD ID";
    @BeforeClass
    public  static void setup()
    {
        RestAssured.defaultParser = Parser.JSON;
        headers= new RequestSpecBuilder().
                setBaseUri(Constants.BASE_URI).
                addHeader("Content-Type", ContentType.JSON.toString()).
                addQueryParam("key", Constants.TRELLO_API_KEY).
                addQueryParam("token", Constants.TRELLO_TOKEN).
                build();
    }
}
