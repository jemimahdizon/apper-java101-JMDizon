package Flight_pack;

public class App {
    public static void main(String[] args) {
        Flight manilaToBoracay = new Flight();

        System.out.println(manilaToBoracay.passengers);
        System.out.println(manilaToBoracay.seats);

        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();

        manilaToBoracay.addPassenger(); //Full

        manilaToBoracay.setNumberOfSeats(20);

        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();

        System.out.println(
                "Current # of available seats: " + manilaToBoracay.seats);// 7
        System.out.println(
                "Current # of passengers: " + manilaToBoracay.passengers);// 13
    }
}
