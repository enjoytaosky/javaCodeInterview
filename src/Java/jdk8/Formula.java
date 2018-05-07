package Java.jdk8;

/**
 * FileName: Formula
 * Author:   YuanLongtao
 * Date:     2018/5/7 16:35
 * Description: 抽象方法测试
 * Version: 1.0
 */
public interface Formula {
    double calculate(int a);

    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
