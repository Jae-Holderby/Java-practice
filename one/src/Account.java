public class Account {

  private String number;
  private double balance;
  private String name;
  private String email;
  private String phoneNumber;

  public void setNumber(String number) {
    this.number = number;
  }
  public void setBalance(double balance) {
    this.balance = balance;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public String getNumber(){
    return this.number;
  }
  public double getBalance(){
    return this.balance;
  }
  public String getName(){
    return this.name;
  }
  public String getEmail(){
    return this.email;
  }
  public String getPhoneNumber(){
    return this.phoneNumber;
  }

  public double deposit(double deposit) {
    return this.balance += deposit;
  }

  public double withdrawal(double withdrawal) {
    if (this.balance - withdrawal <= 0) {
      return this.balance -= withdrawal;
    }
    return this.balance;
  }

}
