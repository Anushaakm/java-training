package com.anu.topics.inheritance;
interface Dance{
	void setDance();
}

interface Sing{
	void SetSong();
}
interface Run extends Dance{
	void setDistance();
}
class Men implements Dance,Sing,Run{

	@Override
	public void SetSong() {
		System.out.println("Inheriting Sing here");
		
	}

	@Override
	public void setDance() {
		System.out.println("Inheriting Dance here");
	}

	@Override
	public void setDistance() {
		System.out.println("Inheriting Run here");
		
	}
	
}
public class ClassRunner {
public static void main(String[] args) {
	Men m=new Men();
	m.setDance();
	m.SetSong();
	m.setDistance();
}
}
