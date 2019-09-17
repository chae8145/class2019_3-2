package kr.ac.daelim.uml.zoo;

public class Pigeon extends Animal{
	
	public Pigeon() {
		cry = new PigeonCry();
		fly = new FlyWithWings();
	}

	public void performCry() {
		cry.cry();
	}
	
	public void performFly() {
		fly.fly();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
