
import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> vehicles;
    
    public VehicleRegistry() {
        this.vehicles = new HashMap<>();
    }
        
    public boolean add(LicensePlate licensePlate, String owner){
        if (this.vehicles.containsKey(licensePlate)){
            return false;
        }

        this.vehicles.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        return this.vehicles.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if (this.vehicles.containsKey(licensePlate)) {
            this.vehicles.remove(licensePlate);
            return true;
        }
        
        return false;
    }
    
    public void printLicensePlates(){
        for (LicensePlate plate : this.vehicles.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        HashSet<String> uniqueOwners = new HashSet<>(this.vehicles.values());
        
        for (String owner : uniqueOwners) {
            System.out.println(owner);
        }
        
    }
}
