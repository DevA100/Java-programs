import java.util.Scanner;

public class AccountTest {

//   public static void main(String[] args) {
//
//       Scanner input = new  Scanner(System.in);
//
//       Account myAccount = new Account();
//
//       //System.out.printf("Initial name is %s%n%n", myAccount.getName());
//
//       //System.out.println("Enter Firstname: ");
//
//       //System.out.println("enter ur firstname");
//      // String FirstName = input.nextLine();
//
//       //myAccount.setName(FirstName);
//       System.out.println();
//
//       //System.out.printf("the name in the object myaccount is %n%s%n ", myAccount.getName());
//
//   }


    public static void main(String[] args){

        Scanner input = new  Scanner(System.in);
     Account.Acount updateAccount = new Account.Acount("Chdimma Angel", 50.0);//first instance
    Account.Acount secondUpdate = new Account.Acount("Chdimma Chisom",  -7.53);//instantiation of my variables

        System.out.printf("%s Balance: $%.2f%n", updateAccount.getName(), updateAccount.getBalance() );

         System.out.printf("%s AnotherBalance : $%.2f%n", secondUpdate.getName(), secondUpdate.getBalance());

//obtain input from the customer
        System.out.print("Enter your first DepositAmount: ");
        double DepositAmount = input.nextDouble();
        System.out.printf("%nadding $%.2f to updateAccount %n",DepositAmount );

        updateAccount.deposit(DepositAmount);

//display balance
       System.out.printf("%s Balance is: $%.2f%n", updateAccount.getName(), updateAccount.getBalance());
       System.out.printf("%s Balance is: $%.2f%n", secondUpdate.getName(), secondUpdate.getBalance());

       //for second update
        System.out.print("Enter the secondDeposit: ");
        double secondDeposit = input.nextDouble();
        System.out.printf("%nadding $%.2f Deposit to balance %n", secondDeposit);

        secondUpdate.deposit(secondDeposit); //adding second deposit to balance

        System.out.printf("%s this is the first balance: $%.2f%n", updateAccount.getName(), updateAccount.getBalance());
        System.out.printf("%S this is second balance: $%.2f%n", secondUpdate.getName(), secondUpdate.getBalance());


    }

}
