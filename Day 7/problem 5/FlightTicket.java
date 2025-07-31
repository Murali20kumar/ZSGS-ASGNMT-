public class FlightTicket implements Ticket {
    private String passengerName;
    private String airline;

    public FlightTicket(String passengerName, String airline) {
        this.passengerName = passengerName;
        this.airline = airline;
    }

    @Override
    public void bookTicket() {
        System.out.println("Flight ticket booked for " + passengerName + " with airline: " + airline);
    }
}