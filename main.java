import java.util.ArrayList;
import java.util.List;
public class main {
    public static void main (String[] args) {
    	
     // Create objects for  each class
        Building building = new Building("Home", 7500,45);
        Car car = new Car("Jeep", 550.0);
        Bicycle bicycle = new Bicycle("Bike", 42);

     // Create an ArrayList of CarbonFootprint to hold the objects
        List<Interface> carbonFootprints = new ArrayList<>();
        carbonFootprints.add(building);
        carbonFootprints.add(car);
        carbonFootprints.add(bicycle);

     // Iterate through the ArrayList and invoke getCarbonFootprint method
        
        for (Interface footprint : carbonFootprints) {
            if (footprint instanceof Building) {
                Building b = (Building) footprint;
                System.out.println("Building: " + b.getBuilding());
            } else if (footprint instanceof Car) {
                Car c = (Car) footprint;
                System.out.println("Car: " + c.getCarModel());
            } else if (footprint instanceof Bicycle) {
                Bicycle b = (Bicycle) footprint;
                System.out.println("Bicycle: " + b.getBicycleModel());
            }

            System.out.println("Carbon Footprint: " + footprint.getCarbonFootprint());
            System.out.println();
           }
        }
     }
