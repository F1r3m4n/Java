package com.fdm.model;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ControllerTest {
	
	RegController con;
	
	@Mock
	View mockview; 
	@Mock
	Register mockreg; 
	@Mock
	RegValidator mockval;
	

	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		con = new RegController(mockview, mockval, mockreg);
	}
	

	@Test
	public void testHandleMethodCallsGetUserInputMethod() {
		con.handle();
		verify(mockview).getUserInput();
	}
	
	@Test
	public void testHandleMethodCallsValidateMethodFromRegValidator(){
		when(mockview.getUserInput()).thenReturn("");
		con.handle();
		verify(mockval).validate("");
	}
	
	@Test
	public void testHandleMethodCallsRegisterUserMethodFromRegister(){
		when(mockview.getUserInput()).thenReturn("");
		when(mockval.validate("")).thenReturn(true);
		con.handle();
		verify(mockreg).registerUser("");
	}
	
	@Test
	public void testHandleMethodNotCalledWhenRegisterUserMethodFromRegisterReturnsFalse(){
		when(mockview.getUserInput()).thenReturn("");
		when(mockval.validate("")).thenReturn(false);
		con.handle();
		verify(mockreg, never()).registerUser(anyString());
	}
	
	@Test
	public void testHandleMethodCallsRegisterUserMethodFromRegisterAndValidation(){
		when(mockview.getUserInput()).thenReturn("nlamprou N12345678 nick lamprou");
		when(mockval.validate("nlamprou N12345678 nick lamprou")).thenReturn(true);
		con.handle();
		verify(mockreg).registerUser("nlamprou N12345678 nick lamprou");
	}
	

}
