package pattern.factory;

/**
 * @author taotao
 * @date 2018/4/8
 */
public class FactoryTest {
    public static void main(String[] args) {
        INoodles noodles = SimpleNoodlesFactory.createNoodles(SimpleNoodlesFactory.TYPE_HOT);
        noodles.desc();
        INoodles noodles1 = SimpleNoodlesFactory.createNoodles(SimpleNoodlesFactory.TYPE_LZ);
        noodles1.desc();
        HotNoodles noodles2 = StaticNoodlesFactory.createNoodles(HotNoodles.class);
        noodles2.desc();

        INoodles ft = MulWayNoodlesFactory.createFT();
        ft.desc();
        HotFactory hotFactory = new HotFactory();
        INoodles iNoodles = hotFactory.create();
        iNoodles.desc();

        System.out.println("--------");
        AbstractFoodFactory kfcFoodFactory = new KFCFoodFactory();
        kfcFoodFactory.createDrinks().price();
        kfcFoodFactory.createNoodles().desc();

    }
}
