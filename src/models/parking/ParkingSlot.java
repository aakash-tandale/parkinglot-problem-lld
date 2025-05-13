package models.parking;

import models.mobility.Vehicle;
import models.mobility.VehicleType;

import java.util.*;

public abstract class ParkingSlot {

    private final List<VehicleType> supportedVehicleTypes;
     private ParkingSlotStatus status;
     private final int SlotNumber;
     private ParkingFloor floor;
     private Optional<Vehicle> vehicle;

     public ParkingSlot(List<VehicleType> supportedVehicleTypes, int slotNumber, ParkingFloor floor) {
        this.supportedVehicleTypes = supportedVehicleTypes;
        this.status = ParkingSlotStatus.EMPTY;
        this.SlotNumber = slotNumber;
        this.floor = floor;
        this.vehicle = Optional.empty();
        this.floor.addParkingSlot(this);
     }

     public int getSlotNumber() {
         return SlotNumber;
     }


     public List<VehicleType> getSupportedVehicleTypes() {
         return supportedVehicleTypes;
     }



     public ParkingSlotStatus getStatus() {
         return status;
     }

     public void setStatus(ParkingSlotStatus status) {
         this.status = status;
     }

     public ParkingFloor getFloor() {
         return floor;
     }

     public void setFloor(ParkingFloor floor) {
         this.floor = floor;
     }

     public Optional<Vehicle> getVehicle() {
         return vehicle;
     }

     public void setVehicle(Optional<Vehicle> vehicle) {
         // need to check if the vehicle type is supported or not

         boolean isVehicleSupportedOrNot=supportedVehicleTypes.contains(vehicle.get().getVehicleType());

         if(isVehicleSupportedOrNot){
             this.status = ParkingSlotStatus.OCCUPIED;
             this.vehicle = vehicle;

         }
         else{
             System.out.println("vehicle type is not supported");
         }

     }

     public void RemoveVehicle() {
         this.status = ParkingSlotStatus.EMPTY;
         this.vehicle = Optional.empty();
     }



}
