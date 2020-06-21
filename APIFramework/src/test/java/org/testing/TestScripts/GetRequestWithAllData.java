package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseDataValidationUsingJsonPath;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.ParsingJsonUsingOrgJson;
import org.testing.utilities.PropertiesFileLoad;

import com.jayway.restassured.response.Response;

public class GetRequestWithAllData {
	
	public void testcase3() throws IOException
	{
		
       Properties p=PropertiesFileLoad.propertiesLoad("../APIFramework/URIs.properties");
		HTTPMethods http=new HTTPMethods(p);
		Response res=http.GetRequest("QA_URI");
		ResponseStatusCodeValidate.ResponseStatusValidate(200, res);
		System.out.println("******Third test case data ********");
		System.out.println(res.asString());
		ParsingJsonUsingOrgJson.JsonExtract(res.asString(), "id");
		
		
	}

}
