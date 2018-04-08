package pattern;

/**
 *
 * @author taotao
 * @date 2018/3/27
 */
public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
