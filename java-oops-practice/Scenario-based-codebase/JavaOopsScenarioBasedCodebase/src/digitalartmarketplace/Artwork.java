package digitalartmarketplace;

public abstract class Artwork implements IPurchasable {
	protected String title;
	protected String artist; 
	protected double price;
	protected String licenseType;
	
	//protected String preview;
	
	public Artwork(String title, String artist, double price, String licenseType) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
		//this.preview = preview;
	}
}
