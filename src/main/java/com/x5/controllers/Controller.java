package com.x5.controllers;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.x5.services.impl.GismeteoServiceImpl;

@Log4j
public class Controller {
	
	protected GismeteoServiceImpl gismeteoSerivce;
	
	@Autowired
	public Controller(GismeteoServiceImpl gismeteoSerivce) {
       this.gismeteoSerivce = gismeteoSerivce;
	}
	
	@GetMapping("/test")
	public int test() {
		return 1;
	}
	
}
