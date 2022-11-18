import java.security.*;

public class Main {

	public static void main(String[] args) {
		
		SecureRandom randomNumber = new SecureRandom();
		
		Warrior warrior1 = new Warrior("Warrior1", 400, 100);
		Warrior warrior2 = new Warrior("Warrior2", 400, 100);
		Warrior warrior3 = new Warrior("Warrior3", 400, 100);
		
		Mage mage1 = new Mage("Mage1", 280, 200);
		Mage mage2 = new Mage("Mage2", 280, 200);
		Mage mage3 = new Mage("Mage3", 280, 200);
		
		Role[] roles = {warrior1, warrior2, warrior3, mage1, mage2, mage3};
		
		for(Role r : roles) { System.out.println(r); }
		System.out.println();
		
		while(true) {
			int w = randomNumber.nextInt(6);
			int m = randomNumber.nextInt(6);
			if(w == m) continue;
			
			System.out.println(roles[w].getName() + " attacked " + roles[m].getName() + "...");
			if(roles[w] instanceof Warrior) ((Warrior)roles[w]).NewMoon(roles[m]);
			else if(roles[w] instanceof Mage) ((Mage)roles[w]).SmallFire(roles[m]);
			printStatus(roles[w], roles[m]);
			
			for(Role r : roles) {
				if(r instanceof Warrior) r.setLife(r.getLife() + ((Warrior) r).recoverLife());
				else if(r instanceof Mage) r.setMagic(r.getMagic() + ((Mage) r).recoverMagic());;
			}
		}

	}
	
	public static void printStatus(Role r1, Role r2) {
		System.out.println(r1);
		System.out.println(r2);
		System.out.println();
	}

}