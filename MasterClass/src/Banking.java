public class Banking {

    //instance variables

    private String accountNumber;
    private double balance;
    private String customerName;
    private String eMail;
    private String phoneNumber;

    // constructors
    public Banking(String accountNumber, double balance, String customerName, String eMail, String
            phoneNumber) {

        System.out.println ("Account constructor with parameter called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }


    protected void deposit(double amountDeposited) {
        this.balance = this.balance + amountDeposited;
        System.out.println ("Deposit of " + amountDeposited + " made. New balance is " + this.balance);
    }

    public void withdrawal(double amountWithdrew) {
        if (this.balance - amountWithdrew < 0) {
            System.out.println ("Only " + balance + " left, withdrawal not processed");
        } else {
            this.balance = this.balance - amountWithdrew;
            System.out.println ("Withdrawal of " + amountWithdrew + " processed. Remaining " +
                    "balance = " + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
