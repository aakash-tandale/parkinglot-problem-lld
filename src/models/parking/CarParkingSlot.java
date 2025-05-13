package models.parking;

import models.mobility.VehicleType;

import java.util.*;

public class CarParkingSlot extends ParkingSlot implements CarSlot{
    private String carNumber;
    public CarParkingSlot(int slotNumber, ParkingFloor floor) {
        super(Arrays.asList(VehicleType.CAR,VehicleType.BIKE), slotNumber, floor);


    }

    @Override
    public String getCarNumber() {
        return carNumber;
    }

    @Override
    public void setCarNumber(String carNumber) {
          this.carNumber = carNumber;
    }
}
