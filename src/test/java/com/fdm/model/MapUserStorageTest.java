package com.fdm.model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;



//import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MapUserStorageTest  {
	
	private MapUserStorage mus;
	private Map<String, User> mockmap;
	private User mockuser;
	private View mockview;

	@Before
	public void setUp(){
		mus = MapUserStorage.getInstance();
		mockmap = mock(HashMap.class);
		mockuser = mock(User.class);
		mus.setMap(mockmap);
		mockview = mock(View.class);
		
	}
	

	
	@Test
	public void testGetInstanceReturnsNotNullWhenGetInstanceIsNull() {
		
		assertNotNull(mus);
	}

	@Test
	public void testGetInstanceReturnsTheInstanceWhenItsCalledTwice() {
		
		assertSame(mus, MapUserStorage.getInstance());
	}
	
	@Test
	public void testAddVerifiesThatThePutMethodWasCalled() {
		
		when (mockuser.getUsername()).thenReturn("Nick"); //Stubbing
		mus.add(mockuser);
		verify(mockmap).put("Nick", mockuser);
	}
	
	@Test
	public void testGetVerifiesThatTheGetMethodWasCalled(){
	
		when(mockmap.get("Nick")).thenReturn(mockuser);
		mus.get("Nick");
		assertEquals(mus.get("Nick"), mockuser);
	}
	
	@Test
	public void testRemoveVerifiesThatTheRemoveMethodIsCalled(){
		mus.remove("Nick");
		verify(mockmap).remove("Nick");
	}
	
	@Test
	public void testThatHandleCallsTheGetUserInputMethod(){
		mockview.getUserInput();
		verify(mockview).getUserInput();
	}
	
	
}
