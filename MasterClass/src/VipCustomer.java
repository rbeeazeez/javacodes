public class VipCustomer {

    private String name;
    private double creditLimit;
    private String eMailAddress;


    public VipCustomer(){
        this("default name", 500000.00, "me@gmail" );
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "me@gmail");
    }


    public VipCustomer(String name, double creditLimit, String eMailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.eMailAddress = eMailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }
}
