package models.mobility;

public abstract class Vehicle {

  private String registrationNumber;
  private String color;
  private VehicleType  vehicleType;

  public Vehicle(String registrationNumber, String color, VehicleType vehicleType) {
    this.registrationNumber = registrationNumber;
    this.color = color;
    this.vehicleType = vehicleType;
  }
  public String setRegistrationNumber(String registrationNumber) {
    return this.registrationNumber = registrationNumber;
  }
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public String setColor(String color) {
    return this.color = color;
  }
  public String getColor() {
    return color;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }


}
