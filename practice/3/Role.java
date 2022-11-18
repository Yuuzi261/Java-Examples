
abstract public class Role {
	
	public Role() {
		Name = "None";
		Life = 100;
		Magic = 100;
	}
	public Role(String Name, int Life, int Magic) {
		this.Name = Name;
		this.Life = Life;
		this.Magic = Magic;
	}
	
	public String getName() { return Name; }
	public int getLife() { return Life; }
	public int getMagic() { return Magic; }
	public void setLife(int Life) { this.Life = Life; }
	public void setMagic(int Magic) { this.Magic = Magic;}
	public void DrinkDrug(Drug D) {
		if(D instanceof RedDrug) {  
			Life += ((RedDrug) D).getAddLife();
			System.out.println(Name + " drinked the " + D.getSize() + " RedDrug!");
		}
		else if(D instanceof BlueDrug) { 
			Magic += ((BlueDrug) D).getAddMagic();
			System.out.println(Name + " drinked the " + D.getSize() + " BlueDrug!");
		}
	}
	
	private String Name;
	private int Life;
	private int Magic;
}