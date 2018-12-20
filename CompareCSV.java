package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import java.util.regex

public class CompareCSV {

	public static void main(String[] args)
	{
	    File csv = new File("C:\\Users\\eshnhee\\Desktop\\test.csv");  
	    BufferedReader br = null;
	    //Pattern pattern = Pattern.compile("Sam");
	    try
	    {
	        br = new BufferedReader(new FileReader(csv));
	    } catch (FileNotFoundException e)
	    {
	        e.printStackTrace();
	    }
	    String line = "";
	    String everyLine = "";
	    try {
	            List<String> allString = new ArrayList<>();
	            while ((line = br.readLine()) != null)  
	            {
	            	if (line.equals("name,gender,age")) {
	            		System.out.println("data finded");}	
	                everyLine = line;
	                System.out.println(everyLine);
	                allString.add(everyLine);
	            }
	            System.out.println("csv line number:"+allString.size());
	            
	            
	            String test = "Sam";
	            //Matcher m = new Matcher() ;
	            //m =	everyLine.matcher(test);
	            
	            		
	    } catch (IOException e)
	    {
	        e.printStackTrace();
	    }

	}
}