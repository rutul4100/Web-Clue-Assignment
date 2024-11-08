package functionalTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GetWeatherDetailsFunctionalTest {
  @Test
  public void f() {
	  ///?q=New%20York&key=45973da2a5604734af3113952240811
	  RestAssured
	  			.given()
	  				.contentType(ContentType.JSON)
	  				.queryParam("q", "New York")
	  				.queryParam("key", "45973da2a5604734af3113952240811")
	  				.baseUri("https://api.weatherapi.com/v1")
	  				.log().all()
	  			.when()
	  				.get("current.json")
	  			.then()
	  				.log().all()
	  				.assertThat().statusCode(200);
	  			
  }
}
