package Flight_pack;

import java.util.Scanner;

public class Flight {
    int seats;
    int passengers;

    Flight(){
        seats = 10;
        passengers = 0;
    }

    Flight(int passengers, int seats) {
        this.passengers = passengers;
        this.seats = seats;
    }

    //TODO validate if there are available seats left. If not display "Full"
    public void addPassenger() {
        if (this.seatsAvailable()) {
            this.incrementPassengers();
            this.decrementSeats();
        } else {
            System.out.println("Full");
        }
    }

    private boolean seatsAvailable() {
        return this.seats != 0;
    }

    private void incrementPassengers() {
        this.passengers++;
    }

    private void decrementSeats() {
        this.seats--;
    }

    public void setNumberOfSeats(int seats) {
        if(seats <= this.seats) {
            System.out.println("Seat number is less than or equal to the current capacity.");
        } else {
            this.seats = seats - passengers;
        }
    }
}
