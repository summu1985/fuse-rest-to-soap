package org.mycompany;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;



public class CreateCustomerRestService {

	@POST
	@Path("/createCustomer/")
	@Consumes({"application/json"})
	@Produces({"application/json"})
	public String createCustomer(String input) {
		
		System.out.println("Request Received");
		return "Request Received";
	}
	
}
