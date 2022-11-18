
public class BlueDrug extends Drug {
	public BlueDrug() {}
	public BlueDrug(String Size) {
		super(Size);
		switch (Size) {
			case "large":
				AddMagic = 100;
				break;
			case "middle":
				AddMagic = 60;
				break;
			case "small":
				AddMagic = 30;
				break;
			default:
				AddMagic = 0;
				break;
		}
	}
	
	public int getAddMagic() { return AddMagic; }
	
	private int AddMagic;
}
