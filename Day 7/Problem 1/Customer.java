public class Customer{
    private String name;
    private String address;
    private String phone;

    public Customer(String name, String address, String phone){
       this.name = name;
       this.address= address;
       this.phone = phone;
    }

    public void displayCustomerDetails(){
        System.out.println("Customer Name :" + name);
        System.out.println("Address :" + address);
        System.out.println("Phone :" + phone);
    }
}