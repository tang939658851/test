package com.cssl.observer;

import java.util.Observable;
import java.util.Observer;
/**
 * �۲���2
 * @author Administrator
 *
 */
public class Shopper2 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		Product pp=(Product)o;
		System.out.println(pp.name+"�����ˣ����򰡣���������������");
	}

}
