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
	
	
	public Response GetRequest(String URIKey,String idValue)
	{
		String getURI=pr.getProperty(URIKey)+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(getURI);
		return res;
		
		
	}
	
	
	public Response GetRequest(String URIKey)
	{
	
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(URIKey));
		return res;
		
		
	}
	
	
	public Response UpdateRequest(String bodyData,String URIKey, String idValue)
	{
		String putURI=pr.getProperty(URIKey)+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.put(putURI);
		
		return res;
	}
	
/*	public Response GetRequest(String URIKey)
	{
	
		Response res=
		given()
		.contentType(ContentType.JSON)
		
		.when()
		.get(pr.getProperty(URIKey));
		
		return res;
		
		
	}

*/
}
