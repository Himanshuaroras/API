package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonFileLoad;
import org.testing.utilities.PropertiesFileLoad;

import com.jayway.restassured.response.Response;

public class PostRequestTC {
	
	public static void main(String[] args) throws IOException {
		
		Properties p=PropertiesFileLoad.propertiesLoad("../APIFramework/URIs.properties");
		String body=JsonFileLoad.jsonData("../APIFramework/src/test/java/org/testing/Resources/BodyData.json");
		HTTPMethods http=new HTTPMethods(p);
		Response res=http.PostRequest(body, "QA_URI");
		System.out.println("status code of response code is "+ res.statusCode());
	}

}
