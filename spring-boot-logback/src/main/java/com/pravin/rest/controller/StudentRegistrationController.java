package com.pravin.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pravin.beans.StudentRegistration;
import com.pravin.beans.StudentRegistrationReply;

@Controller
public class StudentRegistrationController {

	@RequestMapping(method = RequestMethod.POST, value="/register/student")
	@ResponseBody
	StudentRegistrationReply registerStudent(@RequestBody StudentRegistration studentReg) {
		
		 System.out.println(studentReg);
		StudentRegistrationReply studentRegReply = new StudentRegistrationReply();
		
		studentRegReply.setName(studentReg.getName());
		studentRegReply.setAge(studentReg.getAge());
		studentRegReply.setRegistrationNumber(studentReg.getRegistrationNumber());
		studentRegReply.setRegistrationStatus(studentReg.getRegistrationStatus());
		
		 
		return studentRegReply;
	}
	
}
