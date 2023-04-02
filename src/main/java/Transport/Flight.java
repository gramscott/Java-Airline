package Transport;

import Employees.CabinCrewMember;
import Employees.Pilot;
import Employees.RankType;
import Passengers.Passenger;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;

    private ArrayList<Passenger> passengers;

    private ArrayList<CabinCrewMember> cabinCrewMembers;

    private Plane plane;

    private String destination;

    private String departureAirport;

    private String departureTime;

    private String flightNum;

    private int seats;


    public Flight(String flightNum, String destination, String departureAirport, String departureTime, int seats) {
        this.pilot = new Pilot("Linda", RankType.CAPTAIN, "G-ABCD");
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = new Plane(PlaneType.BOEING747);
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.seats = seats;

    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int seatsAvailable(){
        return this.plane.size();
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public void setCabinCrewMembers(ArrayList<CabinCrewMember> cabinCrewMembers) {
        this.cabinCrewMembers = cabinCrewMembers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getNumberOfAvailableSeats(){
        return plane.getPlaneType().getCapacity() - passengers.size();
    }


    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
}


