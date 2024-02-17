public class ClockTest {
    public static void main(String[] args) {
        // Create a Clock instance with invalid values
        Clock clock = new Clock(25, 70, 80);

        // Display the initial time
        System.out.println("Initial time:");
        clock.displayTime();

        // Get and display individual components using get methods
        System.out.println("\nInitial components:");
        System.out.println("Hour: " + clock.getHour());
        System.out.println("Minute: " + clock.getMinute());
        System.out.println("Second: " + clock.getSecond());

        // Set valid values for hour, minute, and second
        clock.setHour(12);
        clock.setMinute(30);
        clock.setSecond(45);

        // Display the updated time
        System.out.println("\nUpdated time:");
        clock.displayTime();

        // Get and display individual components after the update
        System.out.println("\nUpdated components:");
        System.out.println("Hour: " + clock.getHour());
        System.out.println("Minute: " + clock.getMinute());
        System.out.println("Second: " + clock.getSecond());
    }
}
