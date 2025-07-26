class CommonTicket{
    protected String passengerName;

    public CommonTicket (String passengerName){
           this.passengerName = passengerName;
    }

    public void bookTicket(){
        System.out.println("Ticket booked for :" + passengerName);
    }
}

class Bus extends CommonTicket {

    private String boardingPoint;

    public Bus(String passengerName, String boardingPoint){

        super(passengerName);

        this.boardingPoint = boardingPoint;

    }

    public void bookTicket(){
        System.out.println("Bus Ticket for :" + passengerName + "from " + boardingPoint + "via TNSTC");
    }

}

class Train extends CommonTicket {

   private String coach ;

   public Train (String passengerName, String coach){
    super(passengerName);
    this.coach = coach;
   }

   public void bookTicket(){
    System.out.println("Train ticket booked for" + passengerName + "in" + coach + "Coach Via IRCTC");
   }

}

class Flight extends CommonTicket {

    private String airlines;

    public Flight( String passengerName, String airlines){
    super(passengerName);
       this.airlines = airlines;
    }

    public void bookTicket(){
        System.out.println("Flight ticket booked for " + passengerName + "in" + airlines + "Airlines");
    }

}

public class Ticket{

    public static void main (String[] args){
        CommonTicket t1 =  new Bus("Murali", "Cheranmahadevi");
        CommonTicket t2 =  new Train("Murali" , "Sleeper A/C");
        CommonTicket t3 =  new Flight("Murali" , "AirIndia");

        t1.bookTicket();
        t2.bookTicket();
        t3.bookTicket();

    }
}