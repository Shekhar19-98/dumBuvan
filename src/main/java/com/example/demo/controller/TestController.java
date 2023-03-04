package com.example.demo.controller;

import com.example.demo.models.request.DumbRequest;
import com.example.demo.models.response.DumbResponse;
import com.example.demo.utils.Constants;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
	@GetMapping(value = "/")
	public String rootHandler()
	{
		return "Hello New spring boot";
	}

	@PostMapping(value = "dumbRequest")
	public DumbResponse dumbRequestHandler(@RequestBody DumbRequest request){
		System.out.println("Request : " + request.toString());
		var response = new DumbResponse();
		response.setResponse(Constants.REQUEST_DENIED + " " + request.getRequester());
		return response;
	}
}
