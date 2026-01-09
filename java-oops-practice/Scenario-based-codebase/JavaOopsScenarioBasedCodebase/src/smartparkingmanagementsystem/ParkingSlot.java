package smartparkingmanagementsystem;

public class ParkingSlot {
	private int slotId;
	private boolean isOccupied;
	private String vehicleTypeAllowed;
	private String location;
	private Vehicle parkedVehicle;
	
	public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
		this.slotId = slotId;
		this.location = location;
		this.vehicleTypeAllowed = vehicleTypeAllowed;
		this.isOccupied = false;
	}
	
	public boolean isAvailable() {
		return !isOccupied;
	}
	
	public boolean canPark(Vehicle v) {
		return v.getClass().getSimpleName().equals(vehicleTypeAllowed);
	}
	
	public void parkVehicle(Vehicle v) {
        if (isOccupied)
            throw new RuntimeException("Slot already occupied");
        if (!canPark(v))
            throw new RuntimeException("Vehicle type not allowed");

        parkedVehicle = v;
        isOccupied = true;
    }

    public Vehicle removeVehicle() {
        if (!isOccupied) return null;
        Vehicle temp = parkedVehicle;
        parkedVehicle = null;
        isOccupied = false;
        return temp;
    }

    public int getSlotId() {
        return slotId;
    }
}
