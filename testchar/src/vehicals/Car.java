package vehicals;

/**
 * Created by Rokers on 2016-12-06.
 */
public class Car extends Vehicle {

    private int sits;
    private String fuel;
    private int alarm;

    public Car( String engineType, int sits, String fuel, int alarm) {
        super(4, 1, 5, engineType);
        this.sits = sits;
        this.fuel = fuel;
        this.alarm = alarm;
    }

    public void engineType(){
        if(super.getEngineType().equals("Disel")){
            System.out.println( "Alarm jak dla Disel");
        }
    }
}
