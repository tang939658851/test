package com.cssl.singleton;

public class Singleton {
	
	/**
	 * ����ʽ����
	 */
	private Singleton() { }
	private static Singleton rr=new Singleton();
	
	public static Singleton getSingleton() {
		return rr;
	}
		
	
	
	/**
	 * ����ʽ����
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
