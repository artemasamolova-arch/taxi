import jdk.javadoc.doclet.Taglet;

public class Car {
    public enum CarType    { ECONOMY, COMFORT, BUSINESS }
    private final String model;
    private final String plate;
    private final CarType type;
    private Location location;

    Car(String model,String plate,CarType type, Location location)
    {

    }
    CarType detType(){return type;}
    Location getLocation()
    {
        return location;
    }
}
