package com.fdm.model;

public class RegController {

	
	View view;
	RegValidator val;
	Register reg;
	
	public RegController(View view, RegValidator val, Register reg){
		this.view = view;
		this.val = val;
		this.reg = reg;
	}
	
	public void handle() {
		String input = view.getUserInput();
		if(val.validate(input))
		reg.registerUser(input);
	}
}
