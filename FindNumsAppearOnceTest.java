package com.company;
//一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果

/*思路：使用TreeSet.add如果TreeSet中存在了当前元素，则ope = false，此时从TreeSet中Remove这个元素
最后TreeSet中剩下的，即为只出现了一次的元素
*/
public class FindNumsAppearOnceTest {
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        {
            Set<Integer> result = new TreeSet<>();
            for (int i = 0; i < array.length; i++) {
                boolean ope = result.add(array[i]);
                if (ope == false) {
                    result.remove(array[i]);
                }
            }
            Iterator<Integer> value = result.iterator();
            num1[0] = value.next();
            num2[0] = value.next();
        }
    }
}
