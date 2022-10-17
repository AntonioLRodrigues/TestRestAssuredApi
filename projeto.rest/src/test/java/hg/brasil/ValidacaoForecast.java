package hg.brasil;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidacaoForecast {

	Response response = RestAssured.get("https://api.hgbrasil.com/weather/"); 
	
	@Test
	public void testValidarForecast() {
		
		String max = response.getBody().path("results.forecast.max[2]", "retornando o max").toString();
		System.out.println(max);
		
	}
	@Test
	public void validarSttsCode() {
		assertEquals(200, response.getStatusCode());
	}
}
