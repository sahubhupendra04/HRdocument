package com.hrdocument.tests;

import java.io.FileInputStream;
import java.util.Properties;

import generics.BaseTest;

public class Demo2 extends BaseTest
{
		public static void main(String[] args) throws Exception
	{
		String path= "./config.properties";
		Properties p = new Properties();
		p.load(new FileInputStream(path));
		System.out.println("url="+p.getProperty("URL"));
		
	}
	
	
	/*@Test
	public void testt() throws FileNotFoundException, IOException{
		String path= "./config.properties";
		Properties p = new Properties();
		p.load(new FileInputStream(path));
		System.out.println("url="+p.getProperty("URL"));
	}*/
	
	
	
}
