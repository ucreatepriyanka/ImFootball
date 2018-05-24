package ucreate.com.ImFootball.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadTestData {
  public static FileReader fileread;
  public static String[] getkeyvalues(String scenario, String filename) throws IOException, ParseException{
		JSONParser parser = new JSONParser();
		try {
			 fileread = new FileReader(System.getProperty("user.dir")+File.separator+"src//test//resources//TestData//"+ filename+".json");}
		catch (FileNotFoundException e){
			e.printStackTrace();}			
		Object obj = parser.parse(fileread);
		org.json.simple.JSONObject jsonobj = (org.json.simple.JSONObject) obj ;
		org.json.simple.JSONArray entry =(org.json.simple.JSONArray) jsonobj.get(scenario);
	    String[] values = new String[entry.size()] ;
	     for (int i = 0; i < entry.size(); i++) {
		 org.json.simple.JSONObject jsonarr = (org.json.simple.JSONObject) entry.get(i);
	     Object[] keyStr = jsonarr.keySet().toArray();
	     String keyvalue = jsonarr.get(keyStr[0]).toString();
	     values [i] = keyvalue; }	  
	     return values;}
   }