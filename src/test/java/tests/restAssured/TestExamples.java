package tests.restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("Response code is " + response.getStatusCode());
		System.out.println("Response string is " + response.getBody().asPrettyString());
	}

}