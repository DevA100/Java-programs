public class CarApplication {

    public static void main(String[] args){

        Car firstCar = new Car("Toyota", "2023", 2000000.00);
        Car secondCar = new Car("Mercediz benz", "2024", 100000000.00);

        System.out.println();

        System.out.printf("firsCar price $%.2f%n",firstCar.getPrice());
        System.out.printf("secondCar price $%.2f%n", secondCar.getPrice());


    }
}
