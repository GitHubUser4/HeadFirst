/**
 * Created by Nehrist on 25.09.2014.
 */
public abstract class Beverage {
    String description = "Unknown beverage";


    public String getDescription() {
        return description;
    }


    public abstract double cost();
}
