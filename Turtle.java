package kr.ac.daelim.uml.zoo;

public class Turtle extends Animal{
	
	public Turtle() {
		cry = new TurtleCry();
		fly = new FlyNoWay();
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
