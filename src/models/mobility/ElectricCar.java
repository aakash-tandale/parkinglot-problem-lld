package models.mobility;

public class ElectricCar extends Vehicle implements ElectricVehicle {
    public ElectricCar(String registrationNumber, String color) {
        super(registrationNumber, color, VehicleType.ELECTRIC_CAR);
    }

    @Override
    public void charge() {

    }

    @Override
    public float getBatteryLevel() {
        return 0;
    }
}
