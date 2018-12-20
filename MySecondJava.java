package test;
import java.io.BufferedWriter;  
import java.io.File;  
import java.io.FileNotFoundException;  
import java.io.FileWriter;  
import java.io.IOException;  
import java.io.BufferedReader; 
import java.io.FileReader;  
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MySecondJava{


	public static void main(String[] args)
	{
	    
	    try {  
	    	File csv = new File("C:\\Users\\eshnhee\\Desktop\\test.csv");   // CSV file 
	   
	        BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true)); 
	        bw.write("\"Perter\"" + "," + "\"M\"" + "," + "\"3\"");  
	        bw.newLine();  
	        bw.close();  
	   
	      } catch (FileNotFoundException e) {  
	        
	        e.printStackTrace();  
	      } catch (IOException e) {  
	        
	        e.printStackTrace();  
	      }  
	    }  

	 
	}



