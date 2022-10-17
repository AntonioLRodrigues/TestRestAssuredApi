package trello.com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidarProfissional {

	Response response = RestAssured.get("https://api.trello.com/1/actions/592f11060f95a3d3d46a987a/list");
	
	@Test
	public void validarName() {
		String name = response.getBody().path("name", "empregadoId");
		assertTrue(name.contains("Professional"));
	
	}
	
	@Test
	public void validarStatusCode() {
		assertEquals(200, response.getStatusCode());
	}
}
