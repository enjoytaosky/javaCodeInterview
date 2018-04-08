package pattern;

/**
 *
 * @author taotao
 * @date 2018/3/27
 */
public class Factory implements IFactory{
    @Override
    public IProduct createProduct() {
        return new Product();
    }
}
