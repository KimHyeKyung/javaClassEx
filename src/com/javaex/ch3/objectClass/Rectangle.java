package com.javaex.ch3.objectClass;

public class Rectangle {
	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * 
	 */
	public Rectangle() {
		super();
	}

	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public int getArea() {
		return this.height * this.width;
	}

	public boolean equals(Object obj) {

		Rectangle r = ((Rectangle) obj);

		if (this.hashCode() == r.hashCode()) {
			return true;
		} else if (this.width == r.width && this.height == r.height) {
			return true;
		} else if (this.getArea() == r.getArea()) {
			return true;
		} else {
			return false;
		}
	}

}
