package com.observepattern;

public class Subscriber 
{
	private String name;
	private Publisher publisher = new Publisher();
	
	
	 
	public Subscriber(String name) 
	{
		super();
		
		this.name = name;
	}

	public void update()
	{
		System.out.println("Hey " + name + ", Uploaded : " + publisher.title);
	}
	
	public void subscribePublisher(Publisher ch) 
	{
		publisher = ch;
	}
	

}