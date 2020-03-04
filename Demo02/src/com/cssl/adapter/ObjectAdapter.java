package com.cssl.adapter;

public class ObjectAdapter implements Target{
	
	private Adapter adapter;
	
	public ObjectAdapter(Adapter adapter) {
		this.adapter=adapter;
	}
	
	@Override
	public void provide2_5() {
		this.adapter.provide3_5();
	}

}
