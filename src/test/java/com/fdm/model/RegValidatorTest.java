package com.fdm.model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;


public class RegValidatorTest {
	

	@Mock
	Storage mockstorage;
	@Mock
	User mockuser;
	
	RegValidator val;

	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		val = new RegValidator(mockstorage);
		
	}
	

	@Test
	public void testRegisterAddsUserCallsAddMethodFromStorage(){
		val.checkUsername("");
		verify(mockstorage).get("");
	}
	
	@Test
	public void testCheckUserNameReturnsTrueWhenStorageReturnsNull(){
		when(mockstorage.get("")).thenReturn(null);
		assertTrue(val.checkUsername(""));
	}
	
	@Test 
	public void testCheckUserNameReturnsFalseWhenStorageReturnsAUser(){
		when(mockstorage.get("")).thenReturn(mockuser);
		assertFalse(val.checkUsername(""));
	}
	
	@Test 
	public void testValitadeReturnsTrueWhenUserChecked(){
		when(mockstorage.get("a")).thenReturn(null);
		assertTrue(val.validate("a 12345678 c d"));
	}
	
	@Test 
	public void testValitadeReturnsFalseWhenUserCheckedBecauseOfShortPassword(){
		when(mockstorage.get("a")).thenReturn(null);
		assertFalse(val.validate("a 1234567 c d"));
	}
	
	@Test 
	public void testValitadeReturnsFalseWhenUserCheckedBecauseOfPasswordWithoutDigits(){
		when(mockstorage.get("a")).thenReturn(null);
		assertFalse(val.validate("a abcdefgh c d"));
	}
	
	@Test 
	public void testValitadeReturnsFalseWhenUserPasswordTooShort(){
		when(mockstorage.get("a")).thenReturn(null);
		assertFalse(val.validate("a b c d"));
	}
	
}


