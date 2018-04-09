package pattern.factory;

/**
 *
 * @author taotao
 * @date 2018/4/8
 */
public class LzFactory extends NoodlesFactory{
    @Override
    public INoodles create() {
        return new LzNoodles();
    }
}
