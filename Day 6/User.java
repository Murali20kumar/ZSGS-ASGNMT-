package travel.user;

import travel.booking.Ticket;

public class User {
     private String name;
     private String email;
     
    public User (String name, String name){
        this.name = name;
        this.email = email;
    }

    public void bookTicket(Ticket ticket) {
        System.out.println("Booking ticket for " + name);
        ticket.displayTicket();
    }
}
