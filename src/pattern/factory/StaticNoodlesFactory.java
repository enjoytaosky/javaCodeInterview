package pattern.factory;

/**
 *
 * @author taotao
 * @date 2018/4/8
 */
public class StaticNoodlesFactory {
    public static <T extends INoodles> T createNoodles(Class<T> clazz){
       T result = null;
        try {
          result = (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
