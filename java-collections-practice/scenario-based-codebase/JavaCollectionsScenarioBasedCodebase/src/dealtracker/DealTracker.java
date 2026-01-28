package dealtracker;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class DealTracker<T extends Promotion> {

    private static final Pattern DEAL_CODE_PATTERN =
            Pattern.compile("DealCode:\\s*(\\w+)");

    private static final Pattern DATE_PATTERN =
            Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");

    private static final Pattern DISCOUNT_PATTERN =
            Pattern.compile("Discount:\\s*(\\d+)%");

    private static final Pattern MIN_PURCHASE_PATTERN =
            Pattern.compile("MinimumPurchase:\\s*(\\d+)");

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

    private Map<String, T> dealMap = new HashMap<>();
    private Set<String> dealCodeSet = new HashSet<>();

    public void loadDeals(String filePath) {

        try (FileInputStream fis = new FileInputStream(filePath);
             BufferedReader br = new BufferedReader(new InputStreamReader(fis))) {

            String line;
            StringBuilder block = new StringBuilder();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    processBlock(block.toString());
                    block.setLength(0);
                } else {
                    block.append(line).append("\n");
                }
            }

            if (block.length() > 0) {
                processBlock(block.toString());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void processBlock(String block) {

        try {
            String dealCode = extract(block, DEAL_CODE_PATTERN);
            String dateStr = extract(block, DATE_PATTERN);
            String discountStr = extract(block, DISCOUNT_PATTERN);
            String minPurchaseStr = extract(block, MIN_PURCHASE_PATTERN);

            if (dealCodeSet.contains(dealCode)) {
                System.out.println("Duplicate deal skipped: " + dealCode);
                return;
            }

            LocalDate validTill =
                    LocalDate.parse(dateStr, FORMATTER);

            if (validTill.isBefore(LocalDate.now())) {
                System.out.println("Expired deal skipped: " + dealCode);
                return;
            }

            int discount = Integer.parseInt(discountStr);
            int minPurchase = Integer.parseInt(minPurchaseStr);

            Deal deal = new Deal(dealCode, validTill,
                    discount, minPurchase);

            dealMap.put(dealCode, (T) deal);
            dealCodeSet.add(dealCode);

        } catch (Exception e) {
            System.out.println("Invalid deal block skipped.");
        }
    }

    private String extract(String text, Pattern pattern) {

        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group(1);
        }

        throw new IllegalArgumentException("Missing field");
    }

    public void printSortedDealsByDiscount() {

        List<T> list = new ArrayList<>(dealMap.values());

        list.sort((d1, d2) -> {
            Deal deal1 = (Deal) d1;
            Deal deal2 = (Deal) d2;
            return Integer.compare(
                    deal2.getDiscountPercentage(),
                    deal1.getDiscountPercentage());
        });

        System.out.println("\nValid Deals Sorted by Discount:");

        list.forEach(System.out::println);
    }
}
