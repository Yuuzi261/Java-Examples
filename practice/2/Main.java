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
		
		Warrior[] warriors = {warrior1, warrior2, warrior3};
		Mage[] mages = {mage1, mage2, mage3};
		
		for(Warrior w : warriors) { System.out.println(w); }
		for(Mage m : mages) { System.out.println(m); }
		System.out.println();
		
		while(true) {
			int w = randomNumber.nextInt(3);
			int m = randomNumber.nextInt(3);
			System.out.println(mages[m].getName() + " attacked " + warriors[w].getName() + "...");
			warriors[w].NewMoon(mages[m]);
			printStatus(warriors[w], mages[m]);
			
			w = randomNumber.nextInt(3);
			m = randomNumber.nextInt(3);
			System.out.println(mages[m].getName() + " attacked " + warriors[w].getName() + "...");
			mages[m].SmallFire(warriors[w]);
			printStatus(warriors[w], mages[m]);
		}

	}
	
	public static void printStatus(Warrior w, Mage m) {
		System.out.println(w);
		System.out.println(m);
		System.out.println();
	}

}
