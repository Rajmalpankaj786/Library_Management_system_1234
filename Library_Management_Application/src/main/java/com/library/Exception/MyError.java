package com.library.Exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MyError {

	private LocalDateTime timeStamp;
	private String msg;
	private String details;
	public MyError(LocalDateTime timeStamp, String msg, String details) {
		super();
		this.timeStamp = timeStamp;
		this.msg = msg;
		this.details = details;
	}
	
	
}
