package zipzipmart;

import java.util.*;

public class SalesReport {

    private List<Sale> sales = new ArrayList<>();

    public void addSale(String date, double amount) {
        sales.add(new Sale(date, amount));
        System.out.println("Sale recorded");
    }

    public void sortByDateAndAmount() {
        if (sales.size() <= 1) return;
        sales = mergeSort(sales);
        System.out.println("Sales sorted using Merge Sort");
    }

    // Merge Sort (stable)
    private List<Sale> mergeSort(List<Sale> list) {
        if (list.size() <= 1) return list;

        int mid = list.size() / 2;
        List<Sale> left = mergeSort(list.subList(0, mid));
        List<Sale> right = mergeSort(list.subList(mid, list.size()));

        return merge(left, right);
    }

    // Merge step (date first, then amount)
    private List<Sale> merge(List<Sale> left, List<Sale> right) {
        List<Sale> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            Sale a = left.get(i);
            Sale b = right.get(j);

            // Compare by date, then amount
            int dateCompare = a.date.compareTo(b.date);

            if (dateCompare < 0 ||
               (dateCompare == 0 && a.amount <= b.amount)) {
                result.add(a);
                i++;
            } else {
                result.add(b);
                j++;
            }
        }

        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));

        return result;
    }

    public void showReport() {
        if (sales.isEmpty()) {
            System.out.println("No sales data");
            return;
        }

        System.out.println("\nDaily Sales Report:");
        for (Sale s : sales) {
            System.out.println(s.date + " | Rs" + s.amount);
        }
    }
}
