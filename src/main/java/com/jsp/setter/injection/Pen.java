package com.jsp.setter.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen {
	private String name;
	private String color;

	public String getName() {
		return name;
	}

	@Value(value = "cello")
	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	@Value(value = "blue")
	public void setColor(String color) {
		this.color = color;
	}

	public void printDetails() {
		System.out.println(name);
		System.out.println(color);
	}

}
