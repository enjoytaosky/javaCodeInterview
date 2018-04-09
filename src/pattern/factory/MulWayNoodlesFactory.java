package pattern.factory;

/**
 *
 * @author taotao
 * @date 2018/4/8
 */
public class MulWayNoodlesFactory {

    /**
     * 创建泡面
     * @return
     */
    public static INoodles createFT(){
        return new FastNoodles();
    }

    /**
     * 创建兰州拉面
     * @return
     */
    public static INoodles createLZ(){
        return new LzNoodles();
    }

    /**
     * 创建热干面
     * @return
     */
    public static INoodles createHOT(){
        return new HotNoodles();
    }
}
