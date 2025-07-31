public class TrainTicket implements Ticket {
    private String passengerName;
    private String trainNumber;

    public TrainTicket(String passengerName, String trainNumber) {
        this.passengerName = passengerName;
        this.trainNumber = trainNumber;
    }

    @Override
    public void bookTicket() {
        System.out.println("Train ticket booked for " + passengerName + " on train: " + trainNumber);
    }
}