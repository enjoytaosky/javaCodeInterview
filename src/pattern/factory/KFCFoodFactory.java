package pattern.factory;

/**
 *
 * @author taotao
 * @date 2018/4/8
 */
public class KFCFoodFactory extends AbstractFoodFactory{
    @Override
    public INoodles createNoodles() {
        return new HotNoodles();
    }

    @Override
    public IDrinks createDrinks() {
        return new ColaDrinks();
    }
}
