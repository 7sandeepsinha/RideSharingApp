package entity;

import java.util.List;

public class Passenger extends User{
    private List<Trip> bookedTrips;

    public Passenger(int id, String name, int age, String phoneNumber, double rating, List<String> reviews, char gender, List<Trip> bookedTrips) {
        super(id, name, age, phoneNumber, rating, reviews, gender);
        this.bookedTrips = bookedTrips;
    }

    public Passenger() {
    }

    public Passenger(List<Trip> bookedTrips) {
        this.bookedTrips = bookedTrips;
    }

    public List<Trip> getBookedTrips() {
        return bookedTrips;
    }

    public void setBookedTrips(List<Trip> bookedTrips) {
        this.bookedTrips = bookedTrips;
    }
}

// QuickRide Code 1 -> complete business logic -> 18th
//19th break
// QuickRide Code 2 -> Sprint Boot and Unit Testing -> 21st

//Project Module -> 25th
