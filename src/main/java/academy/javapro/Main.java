package academy.javapro;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a new Tesla Model S, 2024
        Tesla myTesla = new Tesla("Model S", 2024);

        // Step 2: Display initial status
        System.out.println("Initial Status:");
        System.out.println(myTesla.getMake() + " " + myTesla.getModel() + " " + myTesla.getYear());
        System.out.println("Running: " + myTesla.isRunning());
        System.out.println("Autopilot: " + myTesla.isAutopilotEnabled());
        System.out.println("Charging: " + myTesla.isCharging());

        // Step 3: Test basic vehicle functions
        System.out.println("\nTesting basic vehicle functions:");
        myTesla.startEngine();
        myTesla.accelerate();
        myTesla.brake();

        // Step 4: Test autonomous features
        System.out.println("\nTesting autonomous features:");
        myTesla.enableAutopilot();
        System.out.println("Autopilot is currently: " + myTesla.isAutopilotEnabled());
        myTesla.disableAutopilot();

        // Step 5: Test electric features
        System.out.println("\nTesting electric features:");
        myTesla.charge();
        System.out.println("Charging status: " + myTesla.isCharging());

        // Step 6: Stop the car and display final status
        System.out.println("\nFinal car status:");
        myTesla.stopEngine();
        System.out.println("Running: " + myTesla.isRunning());
        System.out.println("Autopilot: " + myTesla.isAutopilotEnabled());
        System.out.println("Charging: " + myTesla.isCharging());
    }
}
