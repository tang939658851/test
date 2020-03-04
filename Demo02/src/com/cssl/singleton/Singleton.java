package com.cssl.singleton;

public class Singleton {
	
	/**
	 * 饿汉式单例
	 */
	private Singleton() { }
	private static Singleton rr=new Singleton();
	
	public static Singleton getSingleton() {
		return rr;
	}
		
	
	
	/**
	 * 懒汉式单例
	 */
	/*
	 * private static Singleton ss;
	 * 
	 * 
	 * 
	 * public synchronized static Singleton getSingleton() { 
	 * 		if(ss==null) { 
	 * 				ss = new Singleton(); 
	 * 		} return ss; 
	 * }
	 */
}
