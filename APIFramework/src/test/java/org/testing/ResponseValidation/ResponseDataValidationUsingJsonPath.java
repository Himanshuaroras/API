package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseDataValidationUsingJsonPath {
	
	public static void responseData(String expectedData,Response res,String JsonPath)
	{
		
		String actualData=res.jsonPath().get(JsonPath);  // post request data --fetch --actual data
		Assert.assertEquals(actualData, expectedData,"Data is not matching");
		
	}

}
