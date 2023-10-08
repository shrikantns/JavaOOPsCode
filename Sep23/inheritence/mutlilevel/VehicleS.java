package Sep23.inheritence.mutlilevel;

//Write a Java program to create a class called Vehicle with a method called drive().
//Create a subclass called Car that overrides the drive() method to print "Repairing a car".
public class VehicleS {
    public void drive() {
        System.out.println("Repairing a Vehicles");
    }
}

class CarS extends VehicleS {
    public static void main(String[] args) {
        VehicleS vehicleS = new VehicleS();
        CarS carS = new CarS();
        vehicleS.drive();
        carS.drive();
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Repairing a car");
    }
}
