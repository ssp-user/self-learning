package tests.restAssured;

import java.util.HashMap;

import io.restassured.response.Response;

public class WeatherAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String endPoint = "http://api.weatherapi.com/v1/forecast.json";
		HashMap<String, String> map = new HashMap<>();
		map.put("Key", "3fba7a1b3fdd4f4da6692844230305");
		map.put("q", "New Delhi");
		map.put("days", "1");
		Response resGet = io.restassured.RestAssured.given().queryParams(map).get(endPoint);
		System.out.println("resGet.getBody().asPrettyString() --> \n" + resGet.getBody().asPrettyString());
	}

}
