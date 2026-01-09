package smartparkingmanagementsystem;

class ParkingManager {
    private int bookingCount = 0;   // internal record

    public void park(ParkingSlot slot, Vehicle v) {
        slot.parkVehicle(v);
        bookingCount++;
    }

    public void unpark(ParkingSlot slot, int hours) {
        Vehicle v = slot.removeVehicle();
        double bill = v.calculateCharges(hours);
        System.out.println("Vehicle " + v.getVehicleNumber() +
                " parked for " + hours + " hours. Bill = ₹" + bill);
    }

    public void showLogs() {
        System.out.println("Total bookings: " + bookingCount);
    }
}
