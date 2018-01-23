public class VipCustomer {

    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer() {
        this("Unknown", "Unknown.com", 0.00);
    }

    public VipCustomer(String name, String email) {
        this(name, email, 10000.00);
    }

    public VipCustomer(String name, String email, double creditLimit){
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

}
