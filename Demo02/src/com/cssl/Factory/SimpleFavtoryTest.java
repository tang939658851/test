package com.cssl.Factory;

import java.util.Scanner;

/**
 * ¼òµ¥¹¤³§
 * @author Administrator
 *
 */
public class SimpleFavtoryTest {
	public static void main(String[] args) {
		SimpleFavtory s1=SimpleFavtory.getSimpleFavtory();
		Scanner input=new Scanner(System.in);
		String name=input.next();
		Product pp = s1.getSimpleFavtory(name);
		System.out.println(pp.operation1()+pp.operation2());
	}
}
