package tests.restAssured;

import io.restassured.response.Response;

public class DeleteAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String endPoint = "https://reqres.in/api/users/2";
		Response resDel = io.restassured.RestAssured.given().delete(endPoint);
		System.out.println(resDel.statusCode());

	}

}
