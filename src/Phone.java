import java.util.Arrays;

public class Phone {
    private String brand;
    private String model;
    private int price ;
    private  String phoneUserName;
    private Contact[] contacts;
    private Object Arrays;

    public Phone(){

    }

    public Phone(String brand, String model, int price, String phoneUserName, Contact[] contacts) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.phoneUserName = phoneUserName;
        this.contacts = contacts;
    }
    public String getPhoneUserName() {
        return phoneUserName;
    }
    public String getContactCount() {//Telefondun eesin jana kancha kontact bar ekenin sanap chygaryp beret
        int sum=0;
        for(int i=0; i<contacts.length; i++){
            sum++;
        }
        return "Total count of contact Nurles is: " +sum;
    }
    public String getContact(){
        int sum=0;
        for(int i=0; i<contacts.length; i++){
            sum++;
        }
        return "Total sum of contact Nurbol is: " +sum;
    }
    public void getAll(){
        for(int i=0; i<contacts.length; i++) {
            System.out.println(contacts[i] + " ");
        }}
    @Override
    public String toString() {
        Object acts;
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", phoneUserName='" + phoneUserName + '\'' +
                ", contacts=" + Arrays.toString() +
                '}';
    }
}








