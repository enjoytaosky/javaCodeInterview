package pattern;

/**
 *
 * @author taotao
 * @date 2018/3/27
 */
public class Proxy implements Sourceable{
    private Source source;

    public Proxy(){
        this.source = new Source();
    }
    @Override
    public void method() {
        if (source == null){
            source = new Source();
        }
        source.method();
    }
}
