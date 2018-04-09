package pattern.factory;

/**
 *
 * @author taotao
 * @date 2018/4/8
 */
 public class HotFactory extends NoodlesFactory {

    /**
     * 创建
     * @return
     */
    @Override
    public INoodles create() {
        return new HotNoodles();
    }
}
