package com.canh.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.canh.dto.UserDto;
import com.canh.services.ExampleServices;
/**
 * 
 * @author canh
 *
 */
@RestController
@RequestMapping("/example")
public class ExampleController {
	
	@Autowired
	private ExampleServices examplServices;
	
	@RequestMapping(value="/login" ,method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.ALL_VALUE)
	public ResponseEntity<String>login(@RequestBody UserDto user){
		String result = examplServices.test(user.getUserName(),user.getPassword());
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}
	
	@RequestMapping(value="/nameForID" ,method = RequestMethod.GET,produces=MediaType.ALL_VALUE)
	public ResponseEntity<String>nameForID(@RequestParam(value = "userID") String userID) {
		String result = examplServices.getNameForID(userID);
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
	
}
