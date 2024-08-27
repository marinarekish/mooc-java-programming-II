
import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {
    
    HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.facility.putIfAbsent(unit, new ArrayList<>());
        
        ArrayList<String> items = this.facility.get(unit);
        items.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return facility.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        // getting items for storage unit
        ArrayList<String> items = this.facility.get(storageUnit);

        if (items != null) {
            items.remove(item);
            
            if (items.isEmpty()) {
                this.facility.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits(){
        // arraylist empty template 
        ArrayList<String> unitsWithItems = new ArrayList<>();

        for (String unit : this.facility.keySet()) {
            ArrayList<String> items = this.facility.get(unit);
            if (!items.isEmpty()) {
                unitsWithItems.add(unit);
            }
        }

        return unitsWithItems;
    }
}
