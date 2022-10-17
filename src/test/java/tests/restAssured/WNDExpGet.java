package tests.restAssured;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WNDExpGet {

	public static void main(String[] args) {
		Response response = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("jwt","eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzZmFzZnNpaXJnbGVnZCI6Ildlc3RwYWMiLCJuYXNkZnNtZSI6Ildlc3RwYWMiLCJpc3MiOiJXZXN0cGFjIiwiaWlpaWF0IjoxNjU0ODQ4NjMyLCJleHBzZGZhc2Zkc2FmIjoxNzQ5NTQzMDMyLCJzY29wZXMiOiJSU0tfQ3VzdG9tZXJQcmljaW5nX1JfTlAifQ.R3VZB_wu6ET7gBZnpE5Rwnjbe7ytR2P3AvM6EA50EYOZ5sQRw5H_-PeLfhDQGyoWfXexWrJyFhfoGIKBBtpGFiTwrEQ1o27rATsPYTBTVpxxh1AsKkhvcTdVE8TQX1cGCTev6-ReO0-b_-ctk1vvNaHPp-GhI3dQk9yYu7hGTyb3XNWF7ChE3v3Vx8bDtwPP3tqKmlxt_6vUP29g85luak7Mg-jsB4JxkuZVlpb98qNIUKcXOUXrnTBkjSF977sCSTmxF7oOAciVEiMyXOlQki4cr4NSDbLXuHJeK-3qOumYSeCVRdj73xhR71AGUnEiAux2ejznP-AsAjsOyrO2Jw")
				.param("viewerUserId", "TestingUser")
				.param("viewerUserChannel", "Testing")
				.param("rqUID", "123123123")
				.param("status", "10")
				.get("https://wnzl.qa2.ndm.nomisonline.com/api/opportunities");
		System.out.println("Response code is " + response.getStatusCode());
		System.out.println("Response string is " + response.getBody().prettyPrint());
	}
}