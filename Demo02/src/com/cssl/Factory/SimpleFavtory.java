package com.cssl.Factory;

/**
 * �򵥹���
 * @author Administrator
 *
 */
public class SimpleFavtory {
	
	/**
	 * ����ʽ����
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
		
		if(pp.equals("�㽶")) {
			return new Banale();
		}else if(pp.equals("ƻ��")) {
			return new apple();
		}
		return null;
	}
}
