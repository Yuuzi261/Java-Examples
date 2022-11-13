
public class Mage extends Role{
	
	public Mage() {}
	public Mage(String Name, int Life, int Magic) {
		super(Name, Life, Magic);
	}
	
	public void SmallFire(Role R) {
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
		}
		else { System.out.println(this.getName() + " had no MP..."); }
	}
	
	@Override
	public String toString() {
		return String.format("%s: HP: %d, MP: %d", this.getName(), this.getLife(), this.getMagic());
	}
	
}
