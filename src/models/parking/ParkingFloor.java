package models.parking;
import java.util.*;
public class ParkingFloor {

    private int floorNumber;
    private List<ParkingSlot>parkingSlots;


    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.parkingSlots = parkingSlots;

    }
    public boolean addParkingSlot(ParkingSlot parkingSlot) {
        return true;
    }
   public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlots() {
        return this.parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }


}
