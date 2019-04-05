package br.ufc.crateus.school.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@RequestMapping(method = RequestMethod.GET)
	public String getStudent() {
		return "Student API";
	}
	
}
