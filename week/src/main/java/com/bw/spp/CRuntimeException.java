package com.bw.spp;

public class CRuntimeException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CRuntimeException() {
		super();
		
	}

	public CRuntimeException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public CRuntimeException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public CRuntimeException(String message) {
		super(message);
		
	}

	public CRuntimeException(Throwable cause) {
		super(cause);
		
	}
	

}
