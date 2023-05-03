package tests.restAssured;

import com.aventstack.extentreports.gherkin.model.Given;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class TestAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response res = RestAssured.get("https://reqres.in/api/users/3");
		System.out.println("res.getStatusCode() is --> " + res.getStatusCode());
		System.out.println("\nres.getBody().asPrettyString() is --> " + res.getBody().asPrettyString());
		System.out.println("\nres.getBody().toString() is --> " + res.getBody().toString());
		System.out.println("\n****************************************************\n");
		String payLoad = "{\r\n" + 
				"    \"name\": \"Vishal Joshi\",\r\n" + 
				"    \"job\": \"Leader\"\r\n" + 
				"}";
	//	ValidatableResponse resPost = 	io.restassured.RestAssured.given().body(payLoad).post();
		Response resPost = io.restassured.RestAssured.given().body(payLoad).post("https://reqres.in/api/users");
		System.out.println("resPost.asPrettyString() is --> "+ resPost.asPrettyString());
		System.out.println("\n****************************************************\n");
		Response resGet = io.restassured.RestAssured.given().get("https://reqres.in/api/users/3");
		System.out.println("resGet.getStatusCode() is --> " + resGet.getStatusCode());
		System.out.println("\nresGet.getBody().asPrettyString() is --> " + resGet.getBody().asPrettyString());
		System.out.println("\nresGet.getBody().toString() is --> " + resGet.getBody().toString());
		System.out.println("\n****************************************************\n");
	}

}
