package com.observepattern;

public class Newspaper {
	
	public static void main(String args[]) 
	{ 
		
		Publisher pattern = new Publisher();
		 
		Subscriber s1 = new Subscriber ("Dog Object");
		Subscriber s2 = new Subscriber ("Cat Object");
		Subscriber s3 = new Subscriber ("Mouse Object");
		Subscriber s4 = new Subscriber ("Duck Object");
		
		pattern.subscribe(s1); 
		pattern.subscribe(s2);
		pattern.subscribe(s3);
		pattern.subscribe(s4); 
		
		pattern.unsubscribe(s4);
		
		s1.subscribePublisher(pattern);
		s2.subscribePublisher(pattern);
		s3.subscribePublisher(pattern);
		s4.subscribePublisher(pattern);
		
		pattern.upload("New Data Changes");
		
	}
	  

}
