package pattern.Decorator;

/**
 * @Auther: yuanlongtao
 * @Date: 2018/6/3 10:05
 * @Description:
 * @Version: 1.0
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
