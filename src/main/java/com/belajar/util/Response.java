package com.belajar.util;

import com.belajar.model.Hardware;
import lombok.Getter;
import lombok.Setter;

/*Generic Method*/
@Setter /*Setter*/
@Getter /*Getter*/
public class Response<T> {
    private String service;
    private String message;
    private T data;
	public void setService(String service) {
		// TODO Auto-generated method stub
		this.service = service;
	}
	public void setMessage(String message) {
		// TODO Auto-generated method stub
		this.message = message; 
	}
	public void setData(T data) {
		// TODO Auto-generated method stub
		this.data = data;
	}
	
}