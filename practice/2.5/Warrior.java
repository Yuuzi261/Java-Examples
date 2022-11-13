
public class Warrior extends Role{
	
	public Warrior() {}
	public Warrior(String Name, int Life, int Magic) {
		super(Name, Life, Magic);
	}
	
	public void NewMoon(Role R) {
		if(this.getMagic() > 10) {
			this.setMagic(this.getMagic() - 10);
			
			if(R instanceof Warrior)
				R.setLife(R.getLife() - 25);
			else if(R instanceof Mage)
				R.setLife(getLife() - 40);
			
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
