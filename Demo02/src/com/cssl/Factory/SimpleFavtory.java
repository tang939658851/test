package com.cssl.Factory;

/**
 * 简单工厂
 * @author Administrator
 *
 */
public class SimpleFavtory {
	
	/**
	 * 懒汉式单例
	 */
	private SimpleFavtory() {
		
	}
	
	private static SimpleFavtory favtory;
	
	public synchronized static SimpleFavtory getSimpleFavtory() {
		if(favtory==null) {
			favtory=new SimpleFavtory();
		}
		return favtory;
	}
	
	public Product getSimpleFavtory(String pp) {
		
		if(pp.equals("香蕉")) {
			return new Banale();
		}else if(pp.equals("苹果")) {
			return new apple();
		}
		return null;
	}
}
