package compare;

import java.util.Set;

/**
 * @author 阡陌兮
 * @version 1.0.0
 * @date 2018-12-25 14:14
 * @description 测试类
 */
public class TestMain {
    public static void main(String[] args) {
        Integer[] aEle = {1, 2, 3};
        Integer[] bEle = {1, 2, 3, 4};
        Set<Integer> sameElement = CompareElement.getSameElement(aEle, bEle);
        Set<Integer> diffElement = CompareElement.getDiffElement(aEle, bEle);
        System.out.println("The same elements is " + sameElement);
        System.out.println("The different elements is " + diffElement);
    }
}
