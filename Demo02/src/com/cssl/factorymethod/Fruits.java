package com.cssl.factorymethod;
/**
 * 水果类实现商品接口
 * @author Administrator
 *
 */
public class Fruits implements Product{

	@Override
	public String getColor() {
		
		return "黄色";
	}

	@Override
	public String getType() {
		
		return "香蕉";
	}
	
}
