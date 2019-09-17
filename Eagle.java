package kr.ac.daelim.uml.zoo;

public class Eagle extends Animal {
	
	public Eagle() {
	
		cry = new BirdCry();
		fly = new FlyWithWings();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("독수리");
		
	}

}
