package com.fdm.model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		RegView view = new RegView(scanner);
		MapUserStorage storage = MapUserStorage.getInstance();
		
		storage.setMap(map);
		RegValidator val = new RegValidator(storage);
		RegController rc = new RegController(view, val, reg);

	}

}
