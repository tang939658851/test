package com.cssl.observer;

import java.util.Observable;
/**
 * ���۲���
 * @author Administrator
 *
 */
public class Product extends Observable {
	public String name="ƻ��";
	/**
	 * ���۲����Ƿ�ı�״̬
	 * @param flge
	 */
	public void changeState(boolean flge) {
		Shopper ss=new Shopper();
		Shopper2 s=new Shopper2();
		super.addObserver(s);
		super.addObserver(ss);
		if(flge) {
			//�ı�״̬
			super.setChanged();
		}
		super.notifyObservers();
	}
		
}
