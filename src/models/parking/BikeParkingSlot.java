package models.parking;

import models.mobility.VehicleType;

import java.util.*;

public class BikeParkingSlot extends ParkingSlot implements BikeSlot{
    private String bikeNumber;
    public BikeParkingSlot( int slotNumber, ParkingFloor floor) {
        super(List.of(VehicleType.BIKE), slotNumber, floor);
    }

    @Override
    public String getBikeNumber() {
        return bikeNumber;
    }

    @Override
    public void setBikeNumber(String bikeNumber) {
        this.bikeNumber = bikeNumber;
    }
}
