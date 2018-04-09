package pattern.factory;

/**
 *
 * @author taotao
 * @date 2018/4/8
 */
public class LzFoodFactory extends AbstractFoodFactory {
    @Override
    public INoodles createNoodles() {
        return new LzNoodles();
    }

    @Override
    public IDrinks createDrinks() {
        return new WaterDrinks();
    }
}
