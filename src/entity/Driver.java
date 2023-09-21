package entity;

import java.util.List;

public class Driver extends User{
    private List<Vehicle> vehicles;
    private List<Trip> trips;

    public Driver(int id, String name, int age, String phoneNumber, double rating, List<String> reviews, char gender, List<Vehicle> vehicles, List<Trip> trips) {
        super(id, name, age, phoneNumber, rating, reviews, gender);
        this.vehicles = vehicles;
        this.trips = trips;
    }

    public Driver() {
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", rating=" + super.getRating() +
                ", reviews=" + super.getReviews() +
                ", gender=" + super.getGender() +
                ", vehicles=" + vehicles +
                ", trips=" + trips +
                '}';
    }
}
