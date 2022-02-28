package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.example.createcustomer_wsdl.CreateCustomerRequest;


public class CreateCustomerRequestProcessor implements Processor{
	
	
	public void process(Exchange ex) throws Exception{
		
		Customer cust = ex.getIn().getBody(Customer.class);
		CreateCustomerRequest req = new CreateCustomerRequest();
		
		req.setCustID(cust.getCustid());
		req.setFirstName(cust.getFirstname());
		req.setLastName(cust.getLastname());
		req.setCity(cust.getCity());
		req.setPincode(cust.getPincode());
		
		ex.getIn().setBody(req);
		
	}

}
