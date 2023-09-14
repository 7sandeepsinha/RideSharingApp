package entity;

import java.util.List;

public class Trip {
    private int id;
    private Driver driver;
    private Vehicle vehicle;
    private String source;
    private String destination;
    private int availableSeats;
    private List<Passenger> passengers;
    private int costPerSeat;

    public Trip() {
    }

    public Trip(int id, Driver driver, Vehicle vehicle, String source, String destination, int availableSeats, List<Passenger> passengers, int costPerSeat) {
        this.id = id;
        this.driver = driver;
        this.vehicle = vehicle;
        this.source = source;
        this.destination = destination;
        this.availableSeats = availableSeats;
        this.passengers = passengers;
        this.costPerSeat = costPerSeat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int getCostPerSeat() {
        return costPerSeat;
    }

    public void setCostPerSeat(int costPerSeat) {
        this.costPerSeat = costPerSeat;
    }
}
