package dto;

import entity.Driver;
import entity.VehicleType;

public class VehicleRegistrationDto {
    private String name;
    private String number;
    private VehicleType type;
    private String color;
    private int ownerId;

    public VehicleRegistrationDto(String name, String number, VehicleType type, String color, int ownerId) {
        this.name = name;
        this.number = number;
        this.type = type;
        this.color = color;
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
}
