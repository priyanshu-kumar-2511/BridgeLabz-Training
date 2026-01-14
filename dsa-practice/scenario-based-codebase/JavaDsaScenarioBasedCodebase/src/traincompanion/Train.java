package traincompanion;


public class Train {

    private Compartment head;
    private Compartment tail;
    private Compartment current;   // where the passenger is

    public void addCompartment(String name, String service) {
        Compartment newC = new Compartment(name, service);

        if (head == null) {
            head = tail = current = newC;
            return;
        }

        tail.next = newC;
        newC.prev = tail;
        tail = newC;
    }

    public void moveForward() {
        if (current.next != null) {
            current = current.next;
            showCurrent();
        } else {
            System.out.println("You are at the last compartment.");
        }
    }

    public void moveBackward() {
        if (current.prev != null) {
            current = current.prev;
            showCurrent();
        } else {
            System.out.println("You are at the first compartment.");
        }
    }

    public void showCurrent() {
        System.out.println("\nYou are in: " + current.name + " (" + current.service + ")");
        if (current.prev != null)
            System.out.println("Previous: " + current.prev.name);
        if (current.next != null)
            System.out.println("Next: " + current.next.name);
    }

    public void removeCurrent() {
        if (current == null) return;

        System.out.println("Removing: " + current.name);

        if (current.prev != null)
            current.prev.next = current.next;
        else
            head = current.next;

        if (current.next != null)
            current.next.prev = current.prev;
        else
            tail = current.prev;

        current = (current.next != null) ? current.next : current.prev;
    }
}
