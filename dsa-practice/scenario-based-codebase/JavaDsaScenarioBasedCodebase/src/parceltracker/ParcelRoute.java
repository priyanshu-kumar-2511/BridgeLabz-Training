package parceltracker;

public class ParcelRoute {

    private Stage head;

    // Default chain
    public ParcelRoute() {
        head = new Stage("Packed");
        head.next = new Stage("Shipped");
        head.next.next = new Stage("In Transit");
        head.next.next.next = new Stage("Delivered");
    }

    // Show tracking
    public void track() {
        if (head == null) {
            System.out.println("Parcel lost! No tracking available.");
            return;
        }

        System.out.print("Tracking: ");
        Stage temp = head;
        while (temp != null) {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Insert custom checkpoint
    public void addCheckpoint(String after, String newStage) {
        Stage temp = head;

        while (temp != null && !temp.name.equals(after)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found");
            return;
        }

        Stage newNode = new Stage(newStage);
        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Added checkpoint: " + newStage);
    }

    // Simulate lost parcel
    public void markLost() {
        head = null;
        System.out.println("Parcel marked as lost!");
    }
}
