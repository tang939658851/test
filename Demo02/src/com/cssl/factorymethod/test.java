package com.cssl.factorymethod;

public class test {
	public static void main(String[] args) {
		FactoryMethod aa=new FactoryFood();
		Product pp = aa.create();
		System.out.println(pp.getColor()+pp.getType());
	}
}
