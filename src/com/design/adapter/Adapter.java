package com.design.adapter;

public class Adapter implements Target {
	
	private Adaptee adaptee;

	@Override
	public void targetMethod() {
		adaptee.adapteeMethod();
	}

}
