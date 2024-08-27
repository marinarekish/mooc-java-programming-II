
public class Main {

    public static void main(String[] args) {
        // Create a new VehicleRegistry
        VehicleRegistry registry = new VehicleRegistry();

        // Create some LicensePlate objects
        LicensePlate plate1 = new LicensePlate("FI", "ABC-123");
        LicensePlate plate2 = new LicensePlate("FI", "XYZ-987");
        LicensePlate plate3 = new LicensePlate("US", "123-XYZ");
        LicensePlate plate4 = new LicensePlate("FI", "ABC-123"); 
        
        // Add vehicles to the registry
        System.out.println("Adding vehicles:");
        System.out.println("Add " + plate1 + ": " + registry.add(plate1, "John Doe")); // return true
        System.out.println("Add " + plate2 + ": " + registry.add(plate2, "Alice Smith")); // return true
        System.out.println("Add " + plate3 + ": " + registry.add(plate3, "John Doe")); // return true
        System.out.println("Add " + plate4 + ": " + registry.add(plate4, "John Doe")); // return false (duplicate plate)

        // Print license plates
        System.out.println("\nLicense Plates:");
        registry.printLicensePlates();

        // Print owners
        System.out.println("\nOwners:");
        registry.printOwners();

        // Retrieve and print an owner
        System.out.println("\nOwner of " + plate1 + ": " + registry.get(plate1)); // print "John Doe"

        // Remove a vehicle and try to print owners again
        System.out.println("\nRemoving " + plate2 + ": " + registry.remove(plate2)); // return true
        System.out.println("Removing " + plate2 + ": " + registry.remove(plate2)); // return false (already removed)

        // Print license plates and owners after removal
        System.out.println("\nLicense Plates after removal:");
        registry.printLicensePlates();

        System.out.println("\nOwners after removal:");
        registry.printOwners();
    
    }
}
