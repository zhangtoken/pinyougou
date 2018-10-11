package entity;

import java.io.Serializable;

public class Result implements Serializable{
	
	private String message;
	private boolean success;
	
	public Result(){
		super();
	}
	
	public Result(boolean success,String message) {
		super();
		this.message = message;
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	
}
