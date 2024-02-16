public class CarApplication {

    public static void main(String[] args){

        Car firstCar = new Car("Toyota", "2023", 2000000.00);
        Car secondCar = new Car("Merced benz", "2024", 100000000.00);

        System.out.println();

        System.out.printf("firstCar price $%.2f%n",firstCar.getPrice());
        System.out.printf("secondCar price $%.2f%n", secondCar.getPrice());

        double discountPrice = firstCar.percentageDiscount(5);
        double secondDiscountPrice = secondCar.percentageDiscount(7);


        System.out.printf("%n This is discounted price for firstCar $%.2f%n",discountPrice);
        System.out.printf("%n This is discounted price for second price $%.2f%n", secondDiscountPrice);



    }
}
