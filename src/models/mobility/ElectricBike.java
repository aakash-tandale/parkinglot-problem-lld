package models.mobility;

public class ElectricBike extends Vehicle implements ElectricVehicle {

    public ElectricBike(String registrationNumber, String color) {
        super(registrationNumber, color, VehicleType.ELECTRIC_BIKE);
    }

    @Override
    public void charge() {

    }

    @Override
    public float getBatteryLevel() {
        return 0;
    }
}
