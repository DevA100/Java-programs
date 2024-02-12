import java.util.Scanner;

public class AccountTest {

   public static void main(String[] args) {

       Scanner input = new  Scanner(System.in);

       Account.Acount updateAccount = new Account.Acount("Chdimma Angel", 50.0);//first instance
       Account.Acount secondUpdate = new Account.Acount("Chdimma Chisom",  -7.53);//instantiation of my variables

       Account myAccount = new Account();

       //System.out.printf("Initial name is %s%n%n", myAccount.getName());

       //System.out.println("Enter Firstname: ");
       String FirstName = input.nextLine();

       myAccount.setName(FirstName);
       System.out.println();

       //System.out.printf("the name in the object myaccount is %n%s%n ", myAccount.getName());


       System.out.printf("%s Balance: $%.2f%n", updateAccount.getName(), updateAccount.getBalance() );
       System.out.println("hellooo ");

   }

}
