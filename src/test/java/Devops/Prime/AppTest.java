package Devops.Prime;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AppTest 
{
	App x;
	 @Before
	 public void setUp() throws Exception {
	 x=new App();
	 }

	 @After
	 public void tearDown() throws Exception {
	 x=null;
	 }

	 @Test
	 public void test() {
	  assertTrue("Result",App.isPrime(5));
	  assertEquals(false,App.isPrime(9));
	  assertTrue("Result",App.isPrime(7));
	  assertEquals(false,App.isPrime(10));
	  assertTrue("Result",App.isPrime(19));
	  assertEquals(false,App.isPrime(30));
	  assertTrue("Result",App.isPrime(97));
	  assertEquals(false,App.isPrime(1));
	 }
}