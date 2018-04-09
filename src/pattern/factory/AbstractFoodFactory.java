package pattern.factory;

/**
 *
 * @author taotao
 * @date 2018/4/8
 */
public abstract class AbstractFoodFactory {

    /**
     * 创建面条
     * @return
     */
    public abstract INoodles createNoodles();

    /**
     * 创建饮料
     * @return
     */
    public abstract IDrinks createDrinks();
}
