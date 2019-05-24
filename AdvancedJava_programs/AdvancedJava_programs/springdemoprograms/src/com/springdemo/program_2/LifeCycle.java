package com.springdemo.program_2;

public class LifeCycle {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void hello(){
		System.out.println("hello dude");
	}
	
	public void bye(){
		System.out.println("bye dude");
	}

	@Override
	public String toString() {
		return "LifeCycle [id=" + id + "]";
	}

}
