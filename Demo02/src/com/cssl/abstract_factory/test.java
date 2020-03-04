package com.cssl.abstract_factory;

public class test {
	public static void main(String[] args) {
		AbstractFactory af=new FacctoryA();
		ProductA aa=af.getproductA();
		System.out.println(aa.getColor()+aa.getTypr());
		System.out.println();
		AbstractFactory af2=new FactoryB();
		ProductA aa2=af2.getproductA();
		System.out.println(aa2.getColor()+aa2.getTypr());
	}
}
