package org.webservice;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;

public class HelloWorld {  
	  
    public OMElement sayHelloWorld(OMElement e)  
    {  
    	String msg = "Hello " + e.getAttributeValue(new QName("sayHelloWorld")); 
    	System.out.println(msg);
    	OMElement r = OMAbstractFactory.getOMFactory().createOMElement(new QName("MinhaTag"));
    	r.setText(msg);
        return r;  
    }  
}  

