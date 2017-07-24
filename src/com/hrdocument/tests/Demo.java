package com.hrdocument.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import generics.BaseTest;

public class Demo extends BaseTest 
{
	@Test(enabled = false)
	public void testA()
	{
		Assert.fail();
		
	}
}
