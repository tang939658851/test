package com.cssl.abstract_factory;

public class FacctoryA implements AbstractFactory{

	@Override
	public ProductA getproductA() {
		
		return new ProductA() {
			
			@Override
			public String getTypr() {
				
				return "ƻ��";
			}
			
			@Override
			public String getColor() {

				return "��ɫ";
			}
		};
	}

	@Override
	public ProductB getProductB() {
		
		return new ProductB() {
			
			@Override
			public String getType() {
				
				return "����";
			}
			
			@Override
			public String getColor() {
				
				return "��ɫ";
			}
		};
	}

}
