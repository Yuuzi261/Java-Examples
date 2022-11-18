
public class RedDrug extends Drug {
	public RedDrug() {}
	public RedDrug(String Size) {
		super(Size);
		switch (Size) {
			case "large":
				AddLife = 120;
				break;
			case "middle":
				AddLife = 80;
				break;
			case "small":
				AddLife = 50;
				break;
			default:
				AddLife = 0;
				break;
		}
	}
	
	public int getAddLife() { return AddLife; }
	
	private int AddLife;
}
