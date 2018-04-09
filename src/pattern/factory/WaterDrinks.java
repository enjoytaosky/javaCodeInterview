package pattern.factory;

/**
 *
 * @author taotao
 * @date 2018/4/8
 */
public class WaterDrinks extends IDrinks {
    @Override
    public void price() {
        System.out.println("喝水不要钱-0.00");
    }
}
