package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ErrorAcknowledger  implements Processor{

	public void process (Exchange ex)throws Exception{

		ErrorResponse ErrResp = new ErrorResponse();

		String ErrorDesc = (ex.getProperty("ErrorOccured") != null) ? ex.getProperty("ExpMsg", String.class)
				: "Invalid Request. Missing ESB Headers. Please send the Request with proper ESB Headers.";
		
		String ErrorCode = (ex.getProperty("ErrorOccured") != null) ? "ESB-201"
				: "ESB-101";

		ErrResp.setRetStatus("ERROR");
		ErrResp.setErrorMessage(ErrorDesc);
		ErrResp.setSysErrorCode(ErrorCode);
		ErrResp.setSysErrorMessage("The header has mandatory field blank");
		
		ex.getIn().setBody(ErrResp);
	}
}
