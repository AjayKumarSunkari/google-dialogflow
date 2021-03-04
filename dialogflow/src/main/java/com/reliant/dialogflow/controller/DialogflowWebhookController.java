package com.reliant.dialogflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.cloud.dialogflow.v2.WebhookRequest;
import com.google.cloud.dialogflow.v2.WebhookResponse;
import com.reliant.dialogflow.model.Employee;

@RestController
//@RequestMapping("dialogflow")
public class DialogflowWebhookController {

	@GetMapping(path="/getPaymentOptions",produces="application/json" )
	public Employee getPaymentOptions() {
		
		return new Employee("123","Ajay Kumar");
		
	}

	@PostMapping(path="/createPaymentOption",consumes="application/json",produces="application/json")
	public WebhookResponse createPaymentOptions(WebhookRequest request) {
		
		return WebhookResponse.newBuilder().setFulfillmentText("Example reply 1 ").build();
		
	}
}
