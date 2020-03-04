package com.cssl.factorymethod;

public class FactoryFood implements FactoryMethod{

	@Override
	public Product create() {
		
		return new Food();
	}

}
