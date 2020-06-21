package org.testing.Trigger;

import java.io.IOException;

import org.testing.TestScripts.GetRequest;
import org.testing.TestScripts.GetRequestWithAllData;
import org.testing.TestScripts.PostRequestTC;

public class TriggerClass {
	
	public static void main(String[] args) throws IOException {
		
		PostRequestTC post=new PostRequestTC();
		post.testcase1();
		
		
		GetRequest get=new GetRequest();
		get.testcase2();
		
		GetRequestWithAllData g=new GetRequestWithAllData();
				g.testcase3();
		
	}

}
