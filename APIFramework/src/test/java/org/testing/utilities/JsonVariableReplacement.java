package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonVariableReplacement {
	
	
	public static String JsonValuetoVariable(String JsonData,String VariableName,String InsertedValue)
	{
		
		String returnData=JsonData.replaceAll(Pattern.quote("{{"+VariableName+"}}"), InsertedValue);
		return returnData;
	}

}
