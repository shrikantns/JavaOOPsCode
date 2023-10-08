package Sep23.inheritence.mutlilevel;

//Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
//Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuelefficiency, distance traveled, and maximum speed.
public abstract class VehicleT {
    private final String make;
    private final String model;
    private final int year;
    private final String fuelType;
    private final double fuelefficiency;

    public VehicleT(String make, String model, int year, String fuelType, double fuelefficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelefficiency = fuelefficiency;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelefficiency() {
        return fuelefficiency;
    }

    public abstract double calculateFuelEfficiency();

    public abstract double calculateDistanceTraveled();

    public abstract double getMaxSpeed();
}

class Truck extends VehicleT {
    private double cargoCapacity;

    public Truck(String make, String model, int year, String fuelType, double fuelefficiency) {
        super(make, model, year, fuelType, fuelefficiency);
        this.cargoCapacity = cargoCapacity;

    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        return getFuelefficiency() * (1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
    }

    @Override
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelefficiency();
    }

    @Override
    public double getMaxSpeed() {
        return 80.0;
    }

    static class Car extends VehicleT {
        private int numSeats;

        public Car(String make, String model, int year, String fuelType, double fuelefficiency) {
            super(make, model, year, fuelType, fuelefficiency);
        }

        public int getNumSeats() {
            return numSeats;
        }

        @Override
        public double calculateFuelEfficiency() {
            return getFuelefficiency() * (1.0 / (1.0 + (getNumSeats() / 7.0)));
        }

        @Override
        public double calculateDistanceTraveled() {
            return calculateFuelEfficiency() * getFuelefficiency();
        }

        @Override
        public double getMaxSpeed() {
            return 120.0;
        }

        static class Motorcycle extends VehicleT {
            private double engineDisplacement;

            public Motorcycle(String make, String model, int year, String fuelType, double fuelefficiency) {
                super(make, model, year, fuelType, fuelefficiency);
            }

            public double getEngineDisplacement() {
                return engineDisplacement;
            }

            @Override
            public double calculateFuelEfficiency() {
                return getFuelefficiency() * (1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
            }

            @Override
            public double calculateDistanceTraveled() {
                return calculateFuelEfficiency() * getFuelefficiency();
            }

            @Override
            public double getMaxSpeed() {
                return 80.0;
            }

            public static void main(String[] args) {
                // Create instances of each vehicle type
                Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112);
                Car car = new Car("Volkswagen", "Virtus", 2019, "HYBRID", 6.123);
                Motorcycle motorcycle = new Motorcycle("Massimo Motor", "Warrior200", 2018, "GASOLINE", 2.1);

                // Print the vehicle details and calculations
                System.out.println("Truck Model: " + truck.getModel());
                System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
                System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled() + " miles");
                System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");

                System.out.println("Car Model: " + car.getModel());
                System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
                System.out.println("Distance Traveled: " + car.calculateDistanceTraveled() + " miles");
                System.out.println("Max Speed: " + car.getMaxSpeed() + " mph\n");

                System.out.println("Motorcycle Model: " + motorcycle.getModel());
                System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
                System.out.println("Distance Traveled: " + motorcycle.calculateDistanceTraveled() + " miles");
                System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " mph");
            }
        }
    }
}