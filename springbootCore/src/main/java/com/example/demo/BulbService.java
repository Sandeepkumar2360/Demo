package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BulbService {
	@Autowired
	@Qualifier("su")
	Bulb bulb;

	public Bulb getBulb() {
		return bulb;
	}

	public void setBulb(Bulb bulb) {
		this.bulb = bulb;
	}
	public String askBulb() {
		return bulb.getBulb();
	}
}
