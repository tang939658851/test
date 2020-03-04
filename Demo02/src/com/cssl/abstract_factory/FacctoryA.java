package com.cssl.abstract_factory;

public class FacctoryA implements AbstractFactory{

	@Override
	public ProductA getproductA() {
		
		return new ProductA() {
			
			@Override
			public String getTypr() {
				
				return "苹果";
			}
			
			@Override
			public String getColor() {

				return "红色";
			}
		};
	}

	@Override
	public ProductB getProductB() {
		
		return new ProductB() {
			
			@Override
			public String getType() {
				
				return "李子";
			}
			
			@Override
			public String getColor() {
				
				return "青色";
			}
		};
	}

}
