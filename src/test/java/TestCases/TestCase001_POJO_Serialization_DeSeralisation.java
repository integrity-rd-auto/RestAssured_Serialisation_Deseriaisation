package TestCases;
import org.testng.annotations.Test;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import Base.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class TestCase001_POJO_Serialization_DeSeralisation extends TestBase{
	
	@BeforeClass
	
	public void setUp() {
	
	RestAssured.baseURI="http://localhost:3000";
	RestAssured.basePath="/posts";
	
	}

	@Test(priority=1)

	public void validatePostWithSerialization() {
		
		_Info info1 = new _Info("Info1_Address",1234,"info1@info.com");
		
		_Info info2 = new _Info("Info2_Address",4321,"info2@info.com");
		
	    _Post post = new _Post("1302","title","author",new _Info[] {info1,info2});
			
		logger.info("######TestCase001 Starts######");

		Response response = given()
		.contentType(ContentType.JSON)		
		.body(post)
		.when()
		.post();
		
		System.out.println(response.getBody().asString());
		logger.info("######TestCase001 Ends######");

	}
	@SuppressWarnings("unlikely-arg-type")
	@Test(priority=2)

	public void validatedeSerialization() {
		
		
		_Post post = get("http://localhost:3000/posts/1302").as(_Post.class);
		
		
		
		System.out.println("ID is:" + post.getId());
		
		Assert.assertEquals(post.getId(), "1302");
		
		}	
}
