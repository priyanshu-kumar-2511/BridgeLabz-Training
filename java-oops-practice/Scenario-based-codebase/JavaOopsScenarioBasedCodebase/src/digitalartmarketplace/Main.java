package digitalartmarketplace;

/*19. "Artify – Digital Art Marketplace"
Story: Artists sell digital art via Artify. Buyers can purchase, license, or subscribe to collections.
Requirements:
● Artwork class: title, artist, price, licenseType.
● User class: name, walletBalance.
● Interface IPurchasable with purchase() and license() methods.
● Encapsulation: licensing terms are protected.
● Use constructors to initialize artworks with or without previews.
● Operators: deduct wallet balance on purchase.
● Inheritance: DigitalArt, PrintArt from Artwork.
● Polymorphism: licensing varies across art types.*/

public class Main {
    public static void main(String[] args) {

        User user = new User("Priyanshu", 5000);

        Artwork artwork1 = new DigitalArt("Cyber City", "Alex", 1500, "Personal Use");
        Artwork artwork2 = new PrintArt("Nature Sketch", "Maya", 2000, "Single Print");

        artwork1.purchase(user);
        artwork1.license(user);

        artwork2.purchase(user);
        artwork2.license(user);

        System.out.println("Remaining Balance: " + user.getBalance());
    }
}
