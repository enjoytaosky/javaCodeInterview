package test;

/**
 * @Auther: yuanlongtao
 * @Date: 2018/6/7 09:51
 * @Description:
 * @Version: 1.0
 */
public abstract class BaseHandler implements Handler {
    @Override
    public String handle(String str) {

        return "aa" + builer();
    }

    protected  String builer(){
        return "A";
    }
}
