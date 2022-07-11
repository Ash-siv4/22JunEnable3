package com.qa.testingDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;

public class MathTest {
	Math testClass = new Math();//create an instance of the class we are testing

	@BeforeEach
	public void setup() {
		System.out.println("before");
	}
	
	@Test
	public void addTest() {
		//check if 7 is the result of what i get when i call the add and pass in 3 and 4
		//expected, actual
		assertEquals(7,testClass.add(3, 4));
	}
	
	@Test
	public void subTest() {
		assertEquals(4, testClass.sub(6, 2));
	}
	
//	@Ignore - junit 4 only
	@Test
	public void test() {
		System.out.println("test 2");
	}
	
	@AfterEach
	public void teardown() {
		System.out.println("after");
	}
}
