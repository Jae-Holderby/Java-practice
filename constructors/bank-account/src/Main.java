public class Main {

    public static void main(String[] args) {

        Account accountOne = new Account("712373R2P", 200, "bob", "bob@bobmail.org", "123-456-7890");

        accountOne.depositFunds(35.10);

        accountOne.withdrawalFunds(145.00);

        accountOne.withdrawalFunds(100.00);

        Account accountTwo = new Account("jae", "jae@jaemail.com", "720-300-0756");
        System.out.println(accountTwo.getAccountNumber() + " name " + accountTwo.getName() + " balance is " + accountTwo.getBalance());

        VipCustomer Bill = new VipCustomer();
        System.out.println("Welcome " + Bill.getName() + " @ " + Bill.getEmail() + " Your credit limit is " + String.format("%.2f", Bill.getCreditLimit()));

        VipCustomer Jae = new VipCustomer("Jae", "Jae@jmail.com");
        System.out.println("Welcome " + Jae.getName() + " @ " + Jae.getEmail() + " Your credit limit is " + String.format("%.2f", Jae.getCreditLimit()));

        VipCustomer Katie = new VipCustomer("Katie", "Katie@katemail.com", 3000000.00);
        System.out.println("Welcome " + Katie.getName() + " @ " + Katie.getEmail() + " Your credit limit is " + String.format("%.2f", Katie.getCreditLimit()));
    }
}
