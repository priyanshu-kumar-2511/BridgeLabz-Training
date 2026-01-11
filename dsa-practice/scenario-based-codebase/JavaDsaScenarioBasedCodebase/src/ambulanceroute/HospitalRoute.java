package ambulanceroute;

public class HospitalRoute {

    private Unit head = null;
    private Unit current = null;

    // Add unit to circular list
    public void addUnit(String name, boolean available) {
        Unit newUnit = new Unit(name, available);

        if (head == null) {
            head = newUnit;
            newUnit.next = head;
            current = head;
            return;
        }

        Unit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newUnit;
        newUnit.next = head;
    }

    // Display route
    public void showRoute() {
        if (head == null) {
            System.out.println("No hospital units available");
            return;
        }

        Unit temp = head;
        System.out.println("\nHospital Route:");
        do {
            System.out.println(temp.name + " | Available: " + temp.available);
            temp = temp.next;
        } while (temp != head);
    }

    // Find nearest available unit
    public void routePatient() {
        if (current == null) {
            System.out.println("No units available");
            return;
        }

        Unit start = current;
        do {
            if (current.available) {
                System.out.println("Patient routed to: " + current.name);
                current = current.next;   // next ambulance starts from here
                return;
            }
            current = current.next;
        } while (current != start);

        System.out.println("No available unit! Emergency overload!");
    }

    // Remove unit under maintenance
    public void removeUnit(String name) {
        if (head == null) return;

        Unit curr = head;
        Unit prev = null;

        do {
            if (curr.name.equals(name)) {
                if (prev != null) {
                    prev.next = curr.next;
                } else {
                    // removing head
                    Unit tail = head;
                    while (tail.next != head)
                        tail = tail.next;
                    head = head.next;
                    tail.next = head;
                }
                System.out.println(name + " removed (Under maintenance)");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }
}

