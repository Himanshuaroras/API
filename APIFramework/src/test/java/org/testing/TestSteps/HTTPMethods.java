package org.testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;



//Post request --> require body data and URI
public class HTTPMethods {
	
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	
	
	public Response PostRequest(String BodyData,String URIKey)
	{
	
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(BodyData)
		.when()
		.post(pr.getProperty(URIKey));
		
		return res;
		
		
	}

}
