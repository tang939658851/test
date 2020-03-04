package com.cssl.observer;

import java.util.Observable;
/**
 * 被观察者
 * @author Administrator
 *
 */
public class Product extends Observable {
	public String name="苹果";
	/**
	 * 被观察者是否改变状态
	 * @param flge
	 */
	public void changeState(boolean flge) {
		Shopper ss=new Shopper();
		Shopper2 s=new Shopper2();
		super.addObserver(s);
		super.addObserver(ss);
		if(flge) {
			//改变状态
			super.setChanged();
		}
		super.notifyObservers();
	}
		
}
