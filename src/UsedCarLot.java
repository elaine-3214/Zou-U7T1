import java.util.ArrayList;

public class UsedCarLot {
    //instance variable
    private ArrayList<Car> inventory;

    //constructor
    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    //getter
    public ArrayList<Car> getInventory() {
        return inventory;
    }

    //add
    public void addCar(Car cars) {
        inventory.add(cars);
    }

    public boolean swap(int one, int two){
        if (one>=0 && one<inventory.size() && two>=0 && two<inventory.size()){
            Car temp = inventory.get(one);
            inventory.set(one, inventory.get(two));
            inventory.set(two, temp);
            return true;
        } else {
            return false;
        }
    }
}
