package com.rxjava;

import java.util.List;
import org.junit.*;

public class Poc1Test {
	
	private Poc1 target;
	
	@Before
	public void setup(){
		target = new Poc1();
	}
	
	@Test
	public void shouldPrintList(){
		target.printList();
	}
	
	public void shouldFilter(){
		List<String> filteredValues = target.filter("e", "Hello", "World");
		Assert.assertEquals(1, filteredValues.size());
	}
}
