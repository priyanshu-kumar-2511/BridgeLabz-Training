package foodfest;

/*7. FoodFest – Sorting Stalls by Customer Footfall (Merge Sort)
Story: At a multi-day food festival, organizers track footfall at every stall each day. They collect
daily logs from all zones (already sorted by count), and use Merge Sort to combine zone-wise
data into a master list for performance evaluation.
Concepts Involved:
● Merge Sort
● Combining multiple sorted datasets
● Stability in data with equal values*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of zones: ");
        int zones = sc.nextInt();

        List<List<Stall>> zoneData = new ArrayList<>();

        for (int z = 1; z <= zones; z++) {
            System.out.print("\nEnter number of stalls in Zone " + z + ": ");
            int stalls = sc.nextInt();
            sc.nextLine(); 

            List<Stall> zone = new ArrayList<>();

            System.out.println("Enter stall name and footfall (already sorted):");
            for (int i = 0; i < stalls; i++) {
                System.out.print("Stall name: ");
                String name = sc.nextLine();
                System.out.print("Footfall: ");
                int footfall = sc.nextInt();
                sc.nextLine();

                zone.add(new Stall(name, footfall));
            }

            zoneData.add(zone);
        }

        List<Stall> finalList = zoneData.get(0);
        for (int i = 1; i < zoneData.size(); i++) {
            finalList = MergeSort.merge(finalList, zoneData.get(i));
        }

        System.out.println("\nFinal Sorted Stall Footfall:");
        for (Stall s : finalList) {
            System.out.println(s.name + " - " + s.footfall);
        }
    }
}
