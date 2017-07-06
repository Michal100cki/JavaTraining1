package vehicals;

/**
 * Created by Rokers on 2016-12-06.
 */
public class Vehicle {

    private int wheels;
    private int kierownica;
    private int doors;
    private String engineType;

    public Vehicle(int wheels, int kierownica, int doors, String engineType) {
        this.wheels = wheels;
        this.kierownica = kierownica;
        this.doors = doors;
        this.engineType = engineType;
    }
public void move(int speed){
    System.out.println( "Vehicles move at "+speed);

}
    public int getWheels() {
        return wheels;
    }

    public int getKierownica() {
        return kierownica;
    }

    public int getDoors() {
        return doors;
    }

    public String getEngineType() {
        return engineType;
    }
}
