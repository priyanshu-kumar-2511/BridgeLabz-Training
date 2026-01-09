package digitalartmarketplace;

public class PrintArt extends Artwork{
	public PrintArt (String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}
	
	@Override
	public void purchase(User user) {
		if(!user.detuct(price + 300))
			throw new RuntimeException("Insufficient funds");
		
		System.out.println(user.getName() + " bought print art: " + title);
	}
	
	 @Override
	 public void license(User user) {
	     System.out.println("Print license granted.");
	 }

}
