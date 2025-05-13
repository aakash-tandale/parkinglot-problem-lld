package models.parking;

import models.mobility.VehicleType;

import java.util.*;

public class ElectricBikeParkingSlot extends ParkingSlot implements ElectricSlot,BikeSlot {

    private String bikeNumber;
    public ElectricBikeParkingSlot( int slotNumber, ParkingFloor floor) {
        super(List.of(VehicleType.ELECTRIC_BIKE), slotNumber, floor);
    }

    @Override
    public void chargeVehicle() {

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

