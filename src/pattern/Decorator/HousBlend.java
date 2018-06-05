package pattern.Decorator;

/**
 * @Auther: yuanlongtao
 * @Date: 2018/6/3 10:11
 * @Description:
 * @Version: 1.0
 */
public class HousBlend extends Beverage {
    public HousBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
