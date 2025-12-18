class CourseFee{
    public static void main(String[] args) {
        int fee = 125000;
        int discount_percent = 10;

        int discount = (fee * discount_percent) / 100;
        int final_fee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + final_fee);
    }
}
