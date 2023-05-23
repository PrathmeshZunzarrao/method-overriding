package polymorphism;

public class PubgDriver {

	public static void main(String[] args) {
		
		Pubg p1 = new Pubg();
		
		p1.jump();
		p1.fire();
		p1.reload();
		p1.turnLeft();
		
		
		System.out.println("==================================");
		Pubg p2 = new PubgUpdate();
		
		p2.jump();
		p2.turnRight();
		p2.takeGun("Mk47");
		p2.reload();
		p2.fire();
		
		

	}

}
