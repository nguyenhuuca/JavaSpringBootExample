package com.canh.services;

import org.springframework.stereotype.Service;

/**
 * 
 * @author canh
 *
 */
@Service
public class ExampleServicesImpl implements ExampleServices {

	@Override
	public String test(String user, String password) {
		if (user != null) {
			return "success";
		}
		return "error";

	}

	@Override
	public String getNameForID(String userID) {

		return new String("canh - " + userID);
	}

}
