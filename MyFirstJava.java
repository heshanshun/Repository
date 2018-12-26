package test;
//package com.mark.csv;  

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

public class MyFirstJava {
	
	public static void main(String[] args)
	{
	    File csv = new File("C:\\Users\\eshnhee\\Desktop\\test.csv");  
	    BufferedReader br = null;
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
	                everyLine = line;
	                System.out.println(everyLine);
	                allString.add(everyLine);
	            }
	            System.out.println("csv line number:"+allString.size());
				System.out.println("Hello Github");
	    } catch (IOException e)
	    {
	        e.printStackTrace();
	    }

	}
	}


