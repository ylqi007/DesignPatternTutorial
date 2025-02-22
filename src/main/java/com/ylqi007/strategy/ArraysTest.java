package com.ylqi007.strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Description: JDK的Arrays的Comparator就使用了策略模式
 *     public static <T> void sort(T[] a, Comparator<? super T> c) {
 *         if (c == null) { // 如果c==null, 则按照Arrays定义的方式排序
 *             sort(a);
 *         } else {
 *             if (LegacyMergeSort.userRequested)
 *                 legacyMergeSort(a, c);   // 使用client自定义的comparator实现排序
 *             else
 *                 TimSort.sort(a, 0, a.length, c, null, 0, 0);
 *         }
 *     }
 *
 * @Author: ylqi007
 * @Create: 3/13/24 17:40
 */
public class ArraysTest {
    public static void main(String[] args) {
        Integer[] data1 = {9, 8, 6, 5, 2, 1};

        // 方式1: 定义Comparator
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 >= o2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Arrays.sort(data1, comparator);
        System.out.println("Sorted data1 = " + Arrays.toString(data1));

        // 方式2: 使用Lambda表达式实现Comparator
        Integer[] data2 = {19, 11, 12, 24, 13};
        //Arrays.sort(data2, (v1, v2) -> {      // Method 1
        //    if(v1.compareTo(v2) > 0) {
        //        return 1;
        //    } else {
        //        return -1;
        //    }
        //});
        // Arrays.sort(data2, (v1, v2) -> v1 - v2); // Method 2
        // Arrays.sort(data2, Comparator.comparingInt(v -> v)); // Method 3
        Arrays.sort(data2, Integer::compareTo); // Method 4
        System.out.println("Sorted data2 = " + Arrays.toString(data2));
    }
}
