package com.adl.fh.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adl.fh.request.NameRequest;

@RestController
public class RestApiController {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@PostMapping("/find/name")
	public Map<String, Object> getName(@RequestBody NameRequest nameRequest) {
		logger.info("FIND_NAME_CONTROLLER Request={}", nameRequest);
		Map<String, Object> response = new HashMap<>();
		response.put("STATUS", "SUCCESS");
		response.put("MESSAGE", " **My Entered Name : " + nameRequest.getName());
		logger.info("FIND_NAME_CONTROLLER", "SUCCESS");
		return response;
	}
}
