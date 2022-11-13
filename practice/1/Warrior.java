
public class Warrior {
	
	public Warrior() {
		Name = "None";
		Life = 100;
		Magic = 100;
	}
	public Warrior(String Name, int Life, int Magic) {
		this.Name = Name;
		this.Life = Life;
		this.Magic = Magic;
	}
	
	public String getName() { return Name; }
	public int getLife() { return Life; }
	public int getMagic() { return Magic; }
	public void setLife(int Life) { this.Life = Life; }
	public void setMagic(int Magic) { this.Magic = Magic; }
	
	public void NewMoon(Warrior warrior) {
		if(Magic > 10) {
			Magic -= 10;
			warrior.setLife(warrior.getLife() - 25);
			if(warrior.getLife() <= 0) {
				System.out.println(warrior.getName() + " was killed by " + Name + '!');
				System.exit(0);
			}
		}
		else { System.out.println(Name + " had no MP..."); }
	}
	
	public void NewMoon(Mage mage) {
		if(Magic > 10) {
			Magic -= 10;
			mage.setLife(mage.getLife() - 40);
			if(mage.getLife() <= 0) {
				System.out.println(mage.getName() + " was killed by " + Name + '!');
				System.exit(0);
			}
		}
		else { System.out.println(Name + " had no MP..."); }
	}
	
	private String Name;
	private int Life;
	private int Magic;
	
}
