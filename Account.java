public class Account {

    private String name;

    public void setName(String name){
        this.name = name;
    }

   public String getName(){

        return name;

    }



    public static class Acount{
        private String name;
        private double balance;

        public Acount(String name, double balance){
            this.name = name;

            if (balance>0.0){
                this.balance = balance;

            }

        }

        public void deposit(double depositAmount){
            if (depositAmount > 0.0){
                balance = depositAmount + balance;
            }
        }
public double getBalance(){
            return balance;
}


public void setName( String name){
            this.name = name;
}

public String getName(){
            return name;
}


    }

}
