package com.shudh.application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shudh.application.model.ShudhUser;
import com.shudh.application.service.ShudhUserService;

/**
* <h1>Shudh Applications Backend</h1><br>
* 
* <h1>Class Name:/h1> ShudhUserController <br>
* 
* <h2>This controller class consists all CRUD methods. All these methods are basically REST APIs</h2>
* 
*
* @author  Utkarsh Gupta
* @version 1.0
* @since   14-10-2018
*/
@Controller
public class ShudhUserController {

	@Autowired
	private ShudhUserService shudhUserService;
	
	@RequestMapping(value = "/listShudhUsers", method = RequestMethod.GET)
	public ResponseEntity<List<ShudhUser>> getShudhUsers() {
        
		List<ShudhUser> shudhUsers = shudhUserService.getAllShudhUser(0, 20);
		
		return new ResponseEntity<List<ShudhUser>> (shudhUsers, HttpStatus.OK);
	}
	
}
