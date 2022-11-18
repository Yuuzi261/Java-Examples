
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
	public double getLife() { return Life; }
	public double getMagic() { return Magic; }
	public void setLife(double Life) { this.Life = Life; }
	public void setMagic(double Magic) { this.Magic = Magic;}
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
	private double Life;
	private double Magic;
}