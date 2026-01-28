package dealtracker;

public class Deal extends Promotion {

    private int discountPercentage;
    private int minimumPurchase;

    public Deal(String dealCode,
                java.time.LocalDate validTill,
                int discountPercentage,
                int minimumPurchase) {

        super(dealCode, validTill);
        this.discountPercentage = discountPercentage;
        this.minimumPurchase = minimumPurchase;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    @Override
    public String toString() {
        return "DealCode=" + dealCode +
                ", ValidTill=" + validTill +
                ", Discount=" + discountPercentage + "%" +
                ", MinimumPurchase=" + minimumPurchase;
    }
}
