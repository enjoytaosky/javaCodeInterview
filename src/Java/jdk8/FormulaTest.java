package Java.jdk8;

/**
 * FileName: FormulaTest
 * Author:   YuanLongtao
 * Date:     2018/5/7 16:37
 * Description:
 * Version: 1.0
 */
public class FormulaTest {
    public static void main(String[] args) {
        Formula formula =  new Formula(){

            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        System.out.println(formula.sqrt(16));
        System.out.println(formula.calculate(4));
    }
}
