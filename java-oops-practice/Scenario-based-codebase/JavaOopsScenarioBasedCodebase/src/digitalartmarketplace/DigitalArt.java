package digitalartmarketplace;

public class DigitalArt extends Artwork {
	public DigitalArt (String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}
	
	@Override
	public void purchase(User user) {
		if(!user.detuct(price))
			throw new RuntimeException("Insufficient funds");
		
		System.out.println(user.getName() + " bought digital art: " + title);
	}
	
	 @Override
	 public void license(User user) {
	     System.out.println("Digital license granted: " + licenseType);
	 }
}
