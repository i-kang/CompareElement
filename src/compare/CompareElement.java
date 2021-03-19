package compare;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author moodjoy
 * @version 1.0.0
 * @date 2018-12-25 13:40
 * @description 元素比较
 */
class CompareElement {

    /**
     * @param aEle 数组1
     * @param bEle 数组2
     * @return sameElement
     * @description 获取相同的元素
     **/
    static Set<Integer> getSameElement(Integer[] aEle, Integer[] bEle) {
        //sameElement：最后返回的相同的元素
        Set<Integer> sameElement = new HashSet<>();
        //tempElement：临时存放的元素（aEle or bEle）
        Set<Integer> tempElement = new HashSet<>();
        //将aEle放到集合中
        Collections.addAll(tempElement, aEle);
        //判断bEle中的元素是否存在于tempElement
        for (Integer ele : bEle) {
            if (tempElement.contains(ele)) {
                sameElement.add(ele);
            }
        }
        return sameElement;
    }

    /**
     * @param aEle 数组1
     * @param bEle 数组2
     * @return diffElement（差异的元素）
     * @description 获取不同的元素
     **/
    static Set<Integer> getDiffElement(Integer[] aEle, Integer[] bEle) {
        //sameElement：最后返回的相同的元素
        Set<Integer> diffElement = new HashSet<>();
        //tempElement：临时存放的元素（aEle or bEle）
        Set<Integer> tempElement = new HashSet<>();
        //将aEle放到集合中
        Collections.addAll(tempElement, aEle);
        //判断bEle中的元素是否存在于tempElement
        for (Integer ele : bEle) {
            if (!tempElement.contains(ele)) {
                diffElement.add(ele);
            }
        }
        return diffElement;
    }
}
