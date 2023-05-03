package tests.restAssured;

import io.restassured.response.Response;

public class ExampleAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String endPoint = "https://reqres.in/api/users/";
		String payLoad = "{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}";
	//	Response resPatch = io.restassured.RestAssured.given().body(payLoad).patch(endPoint);
		Response resPatch = io.restassured.RestAssured.given().body(payLoad).patch("https://reqres.in/api/users/2");
		System.out.println("resPatch.getBody().toString() -->"+ resPatch.getBody().toString());
		System.out.println("resPatch.toString() -->"+ resPatch.toString());
		System.out.println("resPatch.getBody().print() -->"+ resPatch.getBody().print());
		System.out.println("resPatch.getStatusCode() -->"+ resPatch.getStatusCode());
	}

}
