package Assignment2.Prob1;

public class Main {
    static void main() {
        Customer customer1 = new Customer("FUser1", "LUser1", "001");
        Customer customer2 = new Customer("FUser2", "LUser2", "002");
        Customer customer3 = new Customer("FUser3", "LUser3", "003");
        Address address1 = new Address("1060 W Addison ST", "Chicago", "IIllinois", "60629");
        Address address2 = new Address("123 N Main St", "Fairfield", "Iowa", "52556");
        Address address3 = new Address("123 Main St, Apt 4B", "New York", "New York", "60630");

        customer1.setBillingAddress(address1);
        customer1.setShippingAddress(address1);

        customer2.setBillingAddress(address2);
        customer2.setShippingAddress(address2);

        customer3.setBillingAddress(address3);
        customer3.setShippingAddress(address3);

        Customer[] customers = {customer1, customer2, customer3};

        for(Customer customer: customers) {
            if (customer.getBillingAddress().getCity().equals("Chicago")) {
                customer.display();
            }
        }

    }
}
