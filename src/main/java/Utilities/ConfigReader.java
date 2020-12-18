package Utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;



public class ConfigReader {
	
		
		
		public static String configPath =System.getProperty("user.dir")+"\\"+"src\\main\\java\\Resources\\config.properties";
		Properties prop = new Properties();
		
		public ConfigReader(){
		try {
				InputStream input = null;		
						
				input = new FileInputStream(configPath);
				prop.load(input);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		public String getUsername()
		{
	     return prop.getProperty("username");
		}
		public String getPassword()
		{
	     return prop.getProperty("password");
		}
		public String getUrl()
		{
	     return prop.getProperty("URL");
		}
		public String getBrowser()
		{
	     return prop.getProperty("browser");
		}


}
