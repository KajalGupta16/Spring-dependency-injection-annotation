package com.jsp.constructor.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	String name;
	String color;

	public Car(@Value(value = "xyz") String name, @Value(value = "blue") String color) {
		this.color = color;
		this.name = name;
	}

	public void printDetails() {
		System.out.println(name);
		System.out.println(color);
	}
}
