package com.example.common.dto;

public class ResponseDto<t> {
	
	private String acknowledgementStatus;
	private String httpStatusCode;
	private t responsePayload;
	private t errorDetails;
	
	public ResponseDto(t responsePayload, int httpStatusCode) {
		super();
		this.setAcknowledgementStatus("Success");
		this.setHttpStatusCode("" + httpStatusCode);
		this.setResponsePayload(responsePayload);
	}
	
	public ResponseDto(int httpStatusCode, t errorDetails) {
		super();
		this.setAcknowledgementStatus("Error");
		this.setHttpStatusCode("" + httpStatusCode);
		this.setErrorDetails(errorDetails);
	}

	public String getAcknowledgementStatus() {
		return acknowledgementStatus;
	}

	public void setAcknowledgementStatus(String acknowledgementStatus) {
		this.acknowledgementStatus = acknowledgementStatus;
	}

	public t getResponsePayload() {
		return responsePayload;
	}

	public void setResponsePayload(t responsePayload) {
		this.responsePayload = responsePayload;
	}

	public String getHttpStatusCode() {
		return httpStatusCode;
	}
	
	public int getHttpStatusCodeAsInt() {
		return Integer.parseInt(httpStatusCode);
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public t getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(t errorDetails) {
		this.errorDetails = errorDetails;
	}
	


}
