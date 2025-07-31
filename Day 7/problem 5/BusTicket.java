public class BusTicket implements Ticket {
    private String passengerName;
    private String route;

    public BusTicket(String passengerName, String route) {
        this.passengerName = passengerName;
        this.route = route;
    }

    @Override
    public void bookTicket() {
        System.out.println("Bus ticket booked for " + passengerName + " on route: " + route);
    }
}