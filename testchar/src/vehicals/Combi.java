package vehicals;

/**
 * Created by Rokers on 2016-12-06.
 */
public class Combi extends Car {

    private int lagSpace;

    public Combi(String engineType, int sits, String fuel, int alarm, int lagSpace) {
        super(engineType, sits, fuel, alarm);
        this.lagSpace = lagSpace;
    }
}
