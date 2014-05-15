package com.fdm.model;

import java.util.Map;



public class MapUserStorage implements Storage{

	private Map<String, User> map;

	private MapUserStorage(){
	}

	private static MapUserStorage instance = null;

	public static MapUserStorage getInstance() {
		if(instance == null) {
			instance = new MapUserStorage();
		}
		return instance;
	}

	public void add(User user) {
		map.put(user.getUsername(), user);
	}

	
	public void setMap(Map<String, User> map){
		this.map = map;
	}
	
	public User get(String username){
		return map.get(username);
	}
	
	public void remove(String username){
		map.remove(username);
	}
}
