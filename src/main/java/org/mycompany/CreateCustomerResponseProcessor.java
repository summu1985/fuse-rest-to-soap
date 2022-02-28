package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.example.createcustomer_wsdl.CreateCustomerResponse;

public class CreateCustomerResponseProcessor implements Processor{
	
	
	public void process (Exchange ex)throws Exception{
		
		CreateCustomerResponse resp = ex.getIn().getBody(CreateCustomerResponse.class);
		
		CustomerResponse custResp = new CustomerResponse();
		
		custResp.setStatus(resp.getStatus());
		custResp.setMessage("Customer Created Successfully");
		
		ex.getIn().setBody(custResp);
		
	}

}
