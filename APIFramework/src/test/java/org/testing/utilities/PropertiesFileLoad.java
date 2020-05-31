package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad {
	
	/************Create a method here that will load the properties file**************/
	/************This method is returning the object of properties file**************/
	
	public static Properties propertiesLoad(String path) throws IOException
	{
		
		File f=new File(path); //connection establish
		FileReader fr=new FileReader(f); //data stream
		Properties pr=new Properties();
		pr.load(fr);
		return pr;
	}

}
