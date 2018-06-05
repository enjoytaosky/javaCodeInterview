package pattern.Decorator;

/**
 * @Auther: yuanlongtao
 * @Date: 2018/6/3 10:10
 * @Description:
 * @Version: 1.0
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
