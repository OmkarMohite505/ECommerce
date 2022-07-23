//aug  final release code

//This is Ravi Tamabde addition
//All code addition is from the point of view of next release of august
//started working on applying facebook authentication

// Unit test for facebook authentication added

package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.AuthenticationResponse;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin//(origins = "http://localhost:4200")
public class AuthenticationController {
	
	@GetMapping
	public AuthenticationResponse Login(HttpServletRequest request){


		//retrieve user credentials from request object
		//inovke rest api of Facebook provider
		//Check the authentication indentity  provided by facebook rest api
		//generate response with authentication token sent by facebook server
		//send response with authenticadtion token in form of 
		//encrypted string

		/*
		 * 
		 * 
			Use OAUTH authentication along with facebook id
		 * 
		 	Integrate OAUTH along with Instagram
		 * 
		 */

	}
	
	@GetMapping
	public AuthenticationResponse authenticateUser(HttpServletRequest request)
	{
		//due to sec filters , user's request will reach here iff basic authentication 
		//using authorization header has worked as per username n pwd 
		//added in app property file
		System.out.println("in auth user "+request.getHeader("authorization"));
		System.out.println("-----------  com.app.controller;  -------   AuthenticationController------authenticateUser  --->    method");
		System.out.println("TESTING CLONE =============");
		System.out.println("TESTING CLONE =============");
	
	
		return new AuthenticationResponse("Successful Authentication");
	}
}
