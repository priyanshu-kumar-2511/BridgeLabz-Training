package dealtracker;

/*3. DealTracker – E-Commerce Discount Validator
Story: An e-commerce platform is flooded with daily deals, sent in a file like:
DealCode: FLAT50
ValidTill: 15-06-2025
Discount: 50%
MinimumPurchase: 999
The DealTracker tool should:
● Read and parse .txt deal entries using FileInputStream
● Use Regex to extract fields like percentage and date
● Filter expired deals using LocalDate + regex validation
● Store all valid deals in a Map<String, Deal>
● Use a Set to prevent duplicate deal codes
● Allow sorting deals by discount using Comparator
● Use Generics to work with other promotion types: cashback, referral bonus, etc.
*/
public class Main {

    public static void main(String[] args) {

        DealTracker<Deal> tracker = new DealTracker<>();

        tracker.loadDeals("scenariodata/dealtracker/deal.txt");

        tracker.printSortedDealsByDiscount();
    }
}
