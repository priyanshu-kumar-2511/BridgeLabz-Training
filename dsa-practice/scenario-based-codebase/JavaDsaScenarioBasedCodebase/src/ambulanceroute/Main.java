package ambulanceroute;

import java.util.Scanner;

/*3. AmbulanceRoute – Emergency Patient Navigation (Circular Linked List)
Story: In a hospital, there are multiple buildings connected in a circular fashion:
Emergency → Radiology → Surgery → ICU → Emergency. When an ambulance is bringing in patients, it follows a Circular Linked List to decide the nearest available unit for emergency treatment.
Requirements:
● Each node represents a hospital unit.
● Rotate through units until an available one is found.
● Simulate patient redirection in a circular path.
● Remove a unit if it's under maintenance.
*/
public class Main {
    public static void main(String[] args) {

        HospitalRoute route = new HospitalRoute();

        route.addUnit("Emergency", true);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", true);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Ambulance Route System =====");
            System.out.println("1. Show hospital route");
            System.out.println("2. Send patient");
            System.out.println("3. Mark unit under maintenance");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    route.showRoute();
                    break;
                case 2:
                    route.routePatient();
                    break;
                case 3:
                    System.out.print("Enter unit name to remove: ");
                    String name = sc.nextLine();
                    route.removeUnit(name);
                    break;
                case 4:
                    System.out.println("System closed");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
