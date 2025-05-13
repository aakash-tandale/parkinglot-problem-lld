package models.parking;

import models.mobility.VehicleType;
import java.util.*;

public class ElectricCarParkingSlot extends ParkingSlot implements ElectricSlot,CarSlot {

    public ElectricCarParkingSlot( int slotNumber, ParkingFloor floor) {
        super(Arrays.asList(VehicleType.ELECTRIC_CAR,VehicleType.ELECTRIC_BIKE), slotNumber, floor);
    }

    @Override
    public void chargeVehicle() {
         System.out.println("charging electric vehicle--");
    }


    @Override
    public String getCarNumber() {
        return "";
    }

    @Override
    public void setCarNumber(String carNumber) {

    }
}
