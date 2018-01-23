public class Account {

    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account(){
        System.out.println("Empty constructor called");
    }

    public Account(String accountNumber, double balance, String name, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String name, String email, String phoneNumber) {
        this("99999", 100.55, name, email, phoneNumber);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("Deposited " + String.format("%.2f", deposit) + " your new balance is " + String.format("%.2f", this.balance));
    }

    public void withdrawalFunds(double withdrawl) {
       if (this.balance - withdrawl < 00.00) {
           System.out.println("Insufficient funds you have a balance of " + String.format("%.2f", this.balance));
       }
       else {
           this.balance -= withdrawl;
           System.out.println("Withdrawal of " + String.format("%.2f", withdrawl) + " processed. Balance remaindoing is " + String.format("%.2f", this.balance));
       }
    }
}
