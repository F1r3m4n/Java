package com.fdm.model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

	
public class RegisterTest {
	
	

	@Mock
	Storage mockstorage; 
	User mockuser;
	
	Register spy;
	Register reg;

	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		reg = new Register(mockstorage);
		spy = spy(reg);
	}
	

	@Test
	public void testRegisterAddsUserCallsAddMethodFromStorage(){
		doReturn(mockuser).when(spy).createUser("");
		spy.registerUser("");
		verify(mockstorage).add(mockuser);
	}
	

	@Test 
	public void testRegisterCreateUserMethodWorksCorrectly(){
		 User user = reg.createUser("a b c d");
		assertEquals("a", user.getUsername());
		assertEquals("b", user.getPassword());
		assertEquals("c", user.getFirstname());
		assertEquals("d", user.getLastname());
	}
}
