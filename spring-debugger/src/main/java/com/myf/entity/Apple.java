package com.myf.entity;

/**
 * @author zgx
 * @date 2022年05月15日 01:36
 */
public class Apple {
	String name;
	String color;

	public Apple(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
