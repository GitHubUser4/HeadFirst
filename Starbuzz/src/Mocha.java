/**
 * Created by Nehrist on 25.09.2014.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }


    public double cost() {
        return .20 + beverage.cost();
    }
}


