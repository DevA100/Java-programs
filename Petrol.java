
import java.util.Scanner;
public class Petrol {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        PetrolPurchase Purchases = new PetrolPurchase("Pinnacle", "fuel", 5,3000,10);

        System.out.printf("the details of the first purchase include:%s, %s, %d, ₦%,.2f, %.2f%%",
                Purchases.getStationLocation(),
                Purchases.getPetroleumType(),
                Purchases.getQuantityPurchased(),
                Purchases.getPrice(),
                Purchases.getPercentageDiscount());

        System.out.println();
        //for fuel location

        System.out.print("Enter your Fuel Station: ");

        System.out.println();

        String fuelLocation = input.nextLine();

        Purchases.setStationLocation(fuelLocation);


        System.out.printf("This is the first inputted fuel location: %n%s", Purchases.getStationLocation());

        //for Petro Type

        System.out.println();

        System.out.print("Enter The type of petrol you bought:");

        System.out.println();

        String petrolType = input.nextLine();


        Purchases.setPetroleumType(petrolType);

        System.out.printf("This is the fuel type: %n%s", Purchases.getPetroleumType());

        System.out.println();

        //Quantity of petrol

        System.out.print("Enter the Quantity of petrol gotten:");
        //to give space
        System.out.println();

        int quantityOfPetrol = input.nextInt();

        Purchases.setQuantityPurchased(quantityOfPetrol);

        System.out.printf("This is the quantity of petrol purchased: %n%d", Purchases.getQuantityPurchased());

        System.out.println();
        // price of petrol

        System.out.println("Enter the price of petrol:");

        double priceOfPetrol = input.nextDouble();

        Purchases.setPrice(priceOfPetrol);

        System.out.printf("This is the Price purchased: %n₦%.2f", Purchases.getPrice());

        System.out.println();
        //DiscountedPrice

        System.out.println("Enter the Percentage Discount: ");

        double discountPrice = input.nextDouble();

        Purchases.setPercentageDiscount(discountPrice);

        System.out.printf("This the percentageDiscount: %n%.2f%%", Purchases.getPercentageDiscount());

        //returning netAmount

        Double netAmount = Purchases.getPurchaseAmount();
        System.out.printf("This is the net Amount: %n₦%,.2f", netAmount);



    }




}
