package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.ResponseDataValidationUsingJsonPath;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonFileLoad;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesFileLoad;

import com.jayway.restassured.response.Response;

public class PostRequestTC {
	
	
	static String idValue;
	public void testcase1() throws IOException {
		
		/***********Properties load + Json file load***********/
		/*******While hitting the request we have to give the id value***********/
		/************hit post request*********/
		/******status code validate***********/
		/******Data validate***********/
	
		
		
		Properties p=PropertiesFileLoad.propertiesLoad("../APIFramework/URIs.properties");
		String body=JsonFileLoad.jsonData("../APIFramework/src/test/java/org/testing/Resources/BodyData.json");
		System.out.println("body data is "+body);
		Random r=new Random();
		Integer randomIDValue= r.nextInt();
	String bodyDataAfterGivingValue=JsonVariableReplacement.JsonValuetoVariable(body, "id", randomIDValue.toString());
	bodyDataAfterGivingValue=JsonVariableReplacement.JsonValuetoVariable(bodyDataAfterGivingValue, "firstname", "Himanshu");
	System.out.println("body data after giving value to id "+bodyDataAfterGivingValue);
		HTTPMethods http=new HTTPMethods(p);
		Response res=http.PostRequest(bodyDataAfterGivingValue, "QA_URI");
		ResponseStatusCodeValidate.ResponseStatusValidate(201, res);
		System.out.println("data is "+res.asString());
		/********Pass assertion**********/
		
		ResponseDataValidationUsingJsonPath.responseData("Himanshu", res, "firstname");
		
		idValue=res.jsonPath().get("id");
		System.out.println("id value is "+idValue);
		
		
		
		
		
		/*******Fail assertion**********/
//		ResponseDataValidationUsingJsonPath.responseData("Govind", res, "firstname");
		
		
/*		HTTPMethods http=new HTTPMethods(p);
		Response res=http.PostRequest(body, "QA_URI");
	ResponseStatusCodeValidate.ResponseStatusValidate(201, res);
	ResponseDataValidationUsingJsonPath.responseData(expectedData, res, JsonPath);
		//System.out.println("status code of response code is "+ res.statusCode()); */
	}

}
