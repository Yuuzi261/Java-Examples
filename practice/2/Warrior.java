
public class Warrior extends Role{
	
	public Warrior() {}
	public Warrior(String Name, int Life, int Magic) {
		super(Name, Life, Magic);
	}
	
	public void NewMoon(Warrior warrior) {
		if(this.getMagic() > 10) {
			this.setMagic(this.getMagic() - 10);
			warrior.setLife(warrior.getLife() - 25);
			if(warrior.getLife() <= 0) {
				System.out.println(warrior.getName() + " was killed by " + this.getName() + '!');
				System.exit(0);
			}
		}
		else { System.out.println(this.getName() + " had no MP..."); }
	}
	
	public void NewMoon(Mage mage) {
		if(this.getMagic() > 10) {
			this.setMagic(this.getMagic() - 10);
			mage.setLife(mage.getLife() - 40);
			if(mage.getLife() <= 0) {
				System.out.println(mage.getName() + " was killed by " + this.getName() + '!');
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
