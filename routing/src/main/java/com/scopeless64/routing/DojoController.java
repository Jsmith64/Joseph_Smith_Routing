package com.scopeless64.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/{location}")
	public String location(@PathVariable("location") String location) {
		if(location.equalsIgnoreCase("dojo")) {
			return "The dojo is awesome!";
		}
		
		if(location.equalsIgnoreCase("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		}
		if(location.equalsIgnoreCase("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		
		return "<br/> end";
	}

}
