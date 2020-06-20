package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseStatusCodeValidate {
	
	public static void ResponseStatusValidate(int expectedStausCode,Response res)
	{
		Assert.assertEquals(res.statusCode(), expectedStausCode,"Status code is not matching");
		
		
	}

}
