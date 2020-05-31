package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;



public class JsonFileLoad {
	/*************this path needs path of json file as input*******/
	/*************this body read the body data after reading it****/
	
	
	public static String jsonData(String path) throws FileNotFoundException
	{
		File f=new File(path);
		FileReader fr=new FileReader(f);
JSONTokener j= new JSONTokener(fr);
JSONObject data=new JSONObject(j);

return data.toString();


		
	}

}
