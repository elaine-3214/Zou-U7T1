import java.util.ArrayList;

public class UsedCarLot {
    //instance variable
    private ArrayList<Car> inventory;

    //constructor
    public UsedCarLot() {
        ArrayList<Car> inventory = new ArrayList<Car>();
    }

    //getter
    public ArrayList<Car> getInventory() {
        return inventory;
    }

    //add
    public void addCar (Car car) {
        inventory.add(car);
    }
}
