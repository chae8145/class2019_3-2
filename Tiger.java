package kr.ac.daelim.uml.zoo;

public class Tiger extends Animal {

	
	public Tiger() {
		
		cry = new TigerCry();
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
