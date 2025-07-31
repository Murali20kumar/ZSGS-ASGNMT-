public class Booking {
    public static void main(String[] args) {
        Ticket t1 = new BusTicket("Murali", "Cheranmahadevi – Tirunelveli");
        Ticket t2 = new TrainTicket("Murali", "TN Express 12622");
        Ticket t3 = new FlightTicket("Murali", "IndiGo");

        // Runtime Polymorphism
        t1.bookTicket(); 
        t2.bookTicket(); 
        t3.bookTicket(); 
    }
}