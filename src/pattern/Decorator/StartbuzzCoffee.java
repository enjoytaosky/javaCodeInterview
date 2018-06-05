package pattern.Decorator;

/**
 * @Auther: yuanlongtao
 * @Date: 2018/6/3 10:18
 * @Description:
 * @Version: 1.0
 */
public class StartbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" +
                beverage.cost());

        Beverage beverage1 = new HousBlend();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" +
                beverage1.cost());
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" +
                beverage1.cost());
    }

}
