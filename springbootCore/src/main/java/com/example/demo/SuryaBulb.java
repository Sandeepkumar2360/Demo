package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("su")
@Scope(value="singleton")
public class SuryaBulb implements Bulb{

	@Override
	public String getBulb() {
		return "Surya Bulb";
	}

}
