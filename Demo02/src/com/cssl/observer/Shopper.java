package com.cssl.observer;

import java.util.Observable;
import java.util.Observer;
/**
 * 观察者1
 * @author Administrator
 *
 */
public class Shopper implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		Product pp=(Product)o;
		System.out.println(pp.name+"降价了，快去抢购啊。。。。。");

	}

}
