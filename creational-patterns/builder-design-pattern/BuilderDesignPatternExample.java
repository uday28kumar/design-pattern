/**
 * @author uday
 * Creating a Car object with various optional features like a seat, GPS, and engine type.
 */

 /**
  * Car class
  */
class Car {
    private int seat;
    private String engine;
    private boolean gps;

    public int getSeat() {
        return seat;
    }
    public void setSeat(int seat) {
        this.seat = seat;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public boolean isGps() {
        return gps;
    }
    public void setGps(boolean gps) {
        this.gps = gps;
    }
    @Override
    public String toString() {
        return "Car [seat=" + seat + ", engine=" + engine + ", gps=" + gps + "]";
    }
    
}

/**
 * Car Builder interface
 */
interface CarBuilder {
    void setSeat(int number);
    void setEngine(String type);
    void setGPS(boolean gps);
}
/**
 * Manual Car Builder class, an implementation of CarBuilder
 */
class ManualCarBuilder implements CarBuilder{
    private Car car;

    public ManualCarBuilder(){
        this.car = new Car();
    }

    @Override
    public void setSeat(int number) {
        this.car.setSeat(number);
    }

    @Override
    public void setEngine(String type) {
        this.car.setEngine(type);
    }

    @Override
    public void setGPS(boolean gps) {
        this.car.setGps(gps);
    }

    public Car getCar() {
        return car;
    }
}

/**
 * Main class
 */
public class BuilderDesignPatternExample {
    public static void main(String[] args) {
        ManualCarBuilder builder = new ManualCarBuilder();
        builder.setSeat(6);
        builder.setEngine("good");
        builder.setGPS(true);

        Car manualCar = builder.getCar();
        System.out.println(manualCar.toString()); // Car [seat=6, engine=good, gps=true]
    }
}