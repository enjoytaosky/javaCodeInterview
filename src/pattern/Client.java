package pattern;

/**
 *
 * @author taotao
 * @date 2018/3/27
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        IProduct product = factory.createProduct();
        product.productMethod();
    }
}
