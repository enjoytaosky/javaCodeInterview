package pattern.factory;

/**
 * @author taotao
 * @date 2018/4/8
 */
public class SimpleNoodlesFactory {
    /**
     * 1:兰州拉面
     * <p>
     * 2:方便面
     * <p>
     * 3：热干面
     */
    public static final int TYPE_LZ = 1;

    public static final int TYPE_FT = 2;

    public static final int TYPE_HOT = 3;


    public static INoodles createNoodles(int type) {
        switch (type) {
            case TYPE_LZ:
                return new LzNoodles();

            case TYPE_FT:
                return new FastNoodles();

            case TYPE_HOT:
                return new HotNoodles();
            default:
                return new HotNoodles();
        }
    }

}
