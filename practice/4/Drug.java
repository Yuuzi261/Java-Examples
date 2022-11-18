
abstract public class Drug {
	public Drug() { Size = "small"; }
	public Drug(String Size) { this.Size = Size; }
	
	public String getSize() { return Size; }
	public void setSize(String Size) { this.Size = Size; }
	
	private String Size;
}
