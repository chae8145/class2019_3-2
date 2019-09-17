package kr.ac.daelim.uml.zoo;

public class Tiger extends Animal {

	
	public Tiger() {
		
		cry = new TigerCry();
		fly = new FlyNoWay();
	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
