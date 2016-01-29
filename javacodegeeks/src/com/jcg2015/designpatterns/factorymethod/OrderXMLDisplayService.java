package com.hwtechservicesllc.jcg.designpatterns.factorymethod;

public class OrderXMLDisplayService extends DisplayService{

	@Override
	public XMLParser getParser() {
		return new OrderXMLParser();
	}

}
