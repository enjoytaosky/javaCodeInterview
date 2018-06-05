package pattern.Decorator;

/**
 * @Auther: yuanlongtao
 * @Date: 2018/6/3 10:16
 * @Description:
 * @Version: 1.0
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Whip";
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }
}
