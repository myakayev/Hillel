package CargoTransportationSystem;

/**
 * This class describes a truck parameters. Dimensions are necessary to understand what goods can fit in the truck.
 * Model of truck and license plate are needed for customer.
 *
 * Author: Oleksandr Miakaiev.
 */

public class Truck {
    String model;
    String licensePlate;
    int loadCapacity;
    double height;
    double length;
    double width;
    Cargo cargo;
}
