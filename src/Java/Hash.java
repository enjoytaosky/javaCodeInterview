package Java;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author taotao
 * @date 2018/3/26
 */
public class Hash {
    public static void main(String[] args) {
        List<EmpWorkCondition> list = new ArrayList<>();
        EmpWorkCondition empWorkCondition = new EmpWorkCondition();
        empWorkCondition.setAge(1);
        empWorkCondition.setName("A");
        list.add(empWorkCondition);
        EmpWorkCondition empWorkCondition1 = new EmpWorkCondition();
        empWorkCondition1.setName("A");
        empWorkCondition1.setAge(3);
        System.out.println(list.contains(empWorkCondition1));
    }
}
