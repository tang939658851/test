package com.cssl.factorymethod;

public class FactoryFruits implements FactoryMethod{

	@Override
	public Product create() {
		
		return new Fruits();
	}

}
