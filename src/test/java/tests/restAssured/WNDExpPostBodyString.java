package tests.restAssured;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WNDExpPostBodyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("jwt", "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6Ildlc3RwYWMiLCJuYW1lIjoiV2VzdHBhYyIsImlzcyI6Ildlc3RwYWMiLCJpYXQiOjE2NTQ4NDg2MzIsImV4cCI6MTc0OTU0MzAzMiwic2NvcGVzIjoiUlNLX0N1c3RvbWVyUHJpY2luZ19XX05QIn0.rouLFbLRkVaG8LnN0zNnq3yNJ3C4sR5Qb88oyO3qjUUHkeQiqnNoXSf7omc_q5bSRhsm4UuI0crsazIKbzpF7TszIo9tEOP4q3TQOB1GN8zyllOI2oUBSta4YnDKvrBiMF-_A9oxG8U14TY2iIKTL2eY8nRzqeLlxCR1agAc9kKzWN0oFC6tChziBX2g6OUJVLUsPFFUKCULBtK30Fo0mxWJ4npoiQRy44XSIE_eiWKk8Z1B5tm7uzTsk2IgyU_R6vwsXJTa0nkkt-rVZHAYBndZemkO2gx1voyNc7ZiQNpoiLAwNzqsVd8VtLmW_fHOsIenuITODug1MAKPlJQrKA");
		headerMap.put("Content-Type", "application/json");
		Response response = RestAssured
							.given()
							.headers(headerMap)
							.body("{ \n"
									+ " \"RqUID\": \"1\",\n"
									+ "\"events\": \n"
									+ " [ \n"
									+ "  {\"opportunityId\":2033143,\"event\":\"completed\"}\n"
									+ " ] \n"
									+ "}")
							.post("https://wnzl.qa2.ndm.nomisonline.com/api/events");
		
		System.out.println("Response is "+ response.getStatusCode());
		System.out.println("Response body is"+ response.getBody().asPrettyString());
	}

}
