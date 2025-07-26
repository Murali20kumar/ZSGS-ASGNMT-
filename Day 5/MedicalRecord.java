import java.util.*;
class MedRecord {
    protected String recId;
    protected String patientName;
    protected String diagnosis;
    protected String dateOfVisit;

   public void inputdetails(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the ID:");
    recId = scan.nextLine();
    System.out.println("Enter the Patient Name:");
    patientName = scan.nextLine();
    System.out.println("Enter Diagnosis:");
    diagnosis = scan.nextLine();
    System.out.println("Enter the Date of Visit :");
    dateOfVisit = scan.nextLine();
   }

   public void displayDetails(){
    System.out.println("RecordId :" + recId);
    System.out.println("Patient Name :" + patientName);
    System.out.println("Diagnosis :" + diagnosis);
    System.out.println("Date of Visit :" + dateOfVisit);
   }

}


class Inpatient extends MedRecord{

    private String roomNo;
    private int daysAdmit;
    private double charges;

    public void inpatientDetails(){
        inputdetails();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Room Number :");
        roomNo = scan.nextLine();
        System.out.println("ENter the number of Days admitted:");
        daysAdmit = scan.nextInt();
        System.out.println("Enter the room charges:");
        charges = scan.nextDouble();
    }

    public double totalCharges(){
        return daysAdmit * charges;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Room number :" + roomNo);
        System.out.println("Number of days admitted:" + daysAdmit);
        System.out.println("Room charges : " + totalCharges());
    }
}

class Outpatient extends MedRecord{
    private String  doctorName;
    private double consultingFee;

    public void outpatientDetails(){
        inputdetails();

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the Doctor Name :");
        doctorName = scan.nextLine();
        System.out.println("Enter the Consulting Fee:");
        consultingFee = scan.nextDouble();
    }

    public void displayDetails(){
        super.displayDetails();
         System.out.println("Doctor Name :" + doctorName);
        System.out.println("Consulting Fees :" + consultingFee);
    }
}

public class MedicalRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Medical Record System ---");
        System.out.print("Enter patient type (1 for InPatient, 2 for OutPatient): ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice == 1) {
            Inpatient ip = new Inpatient();
            ip.inpatientDetails();
            System.out.println("\n--- Inpatient Record ---");
            ip.displayDetails();
        } else if (choice == 2) {
            Outpatient op = new Outpatient();
            op.outpatientDetails();
            System.out.println("\n--- Outpatient Record ---");
            op.displayDetails();
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}