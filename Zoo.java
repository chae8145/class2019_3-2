package kr.ac.daelim.uml.zoo;

public class Zoo {
	static Animal tiger;
	static Animal eagle;
	static Animal turtle;
	static Animal pigeon;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tiger = new Tiger();
		eagle = new Eagle();
		turtle = new Turtle();
		pigeon = new Pigeon();
		
		// ------------------  tiger
		tiger.display();
		tiger.performCry();
		tiger.performFly();
		
		//------------------ eagle
		
		eagle.display();
		eagle.performCry();
		eagle.performFly();
		
		// ---------------- Turtle
		
		turtle.display();
		turtle.performCry();
		turtle.performFly();
		
		// ------------------ pigeon
		
		pigeon.display();
		pigeon.performCry();
		pigeon.performFly();
		
		

	}

}
