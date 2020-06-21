package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;

import com.jayway.restassured.response.Response;

public class GetRequest {
	
	public void testcase2() throws IOException
	{
		
		Properties p=PropertiesFileLoad.propertiesLoad("../APIFramework/URIs.properties");
		
		String idValueForGet=PostRequestTC.idValue;
		HTTPMethods http=new HTTPMethods(p);
		Response res=http.GetRequest("QA_URI", idValueForGet);
		ResponseStatusCodeValidate.ResponseStatusValidate(200, res);
		
		System.out.println("*********Get Request*********");
		System.out.println(res.asString());
		
		/*****For printing we can also use pretty print method******/
	     // res.prettyPrint();
		
	}

}
