import java.security.*;

public class Mage extends Role implements MagicRecoverable{
	
	public Mage() {}
	public Mage(String Name, int Life, int Magic) {
		super(Name, Life, Magic);
	}
	
	public void SmallFire(Role R) {
		
		SecureRandom randomNumber = new SecureRandom();
		
		if(this.getMagic() > 10) {
			this.setMagic(this.getMagic() - 25);
			
			if(R instanceof Warrior)
				R.setLife(getLife() - 40);
			else if(R instanceof Mage)
				R.setLife(getLife() - 60);
			
			if(R.getLife() <= 0) {
				System.out.println(R.getName() + " was killed by " + this.getName() + '!');
				System.exit(0);
			}
			else if(R.getLife() < 40) {
				int rnum = randomNumber.nextInt(100);
				if(rnum < 10) R.DrinkDrug(new RedDrug("large"));
				else if(rnum < 30) R.DrinkDrug(new RedDrug("middle"));
				else if(rnum < 70) R.DrinkDrug(new RedDrug("small"));
			}
			
			if(this.getMagic() < 30) {
				int rnum = randomNumber.nextInt(100);
				if(rnum < 10) this.DrinkDrug(new BlueDrug("large"));
				else if(rnum < 30) this.DrinkDrug(new BlueDrug("middle"));
				else if(rnum < 70) this.DrinkDrug(new BlueDrug("small"));
			}
		}
		else { System.out.println(this.getName() + " had no MP..."); }
	}
	
	@Override
	public double recoverMagic() {
		return MAGICRATE * 1.2;
	}
	
	@Override
	public String toString() {
		return String.format("%s: HP: %.2f, MP: %.2f", this.getName(), this.getLife(), this.getMagic());
	}
	
}