package sort;

import java.util.HashMap;

/**
 * 排序算法集合
 * @author PiscesYE
 */
public class Sort {
    /**
     * 桶排序
     */
    public static int[] bubbleSort(){
        return null;
    }

    /**
     * 快排 - 整形数组
     * @param array 元数据数组，整形数组
     */
    public static void quickSort(int array[], int start, int end){
        if (start >= end)return;
        int measure = array[start];
        int i = start+1, j = end;
        while (i < j){
            while (array[j] >= measure && j > start)j--;
            while (array[i] <= measure && i <= end)i++;

            if (i < j){
                int cache = array[i];
                array[i] = array[j];
                array[j] = cache;
            }
        }

        if (measure > array[j]){
            array[start] = array[j];
            array[j] = measure;
        }else j = start;

        quickSort(array, start, j-1);
        quickSort(array, j + 1, end);
    }

    /**
     * 快排 - 整形数组数据存储于HashMap中，
     * @param map HashMap存储数组，key为值
     *            ，value存储数组下标
     */
    public static void quickSort(HashMap<Integer, Integer> map, int start, int end){
        if (start >= end)return;
        //TODO 实现基于HashMap的快排
    }

    /**
     * 封装，数组转换为HashMap存储，并实现去重
     * key存储值, value存储数组下标
     * 去重：根据HashMap的key唯一性去重
     */
    public static HashMap arrayToHashMap(int array[]){
        if (array==null && array.length<=0)return null;
        int length = array.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        int num = 0;

        for (int i = 0; i < length; i++) {
            if (!map.containsKey(array[i])){//去重
                map.put(array[i], num++);
            }
        }
        return map;
    }

    /**
     * 排序，要求去重
     */
    public HashMap sortDeWeighting(int array[]){
        HashMap<Integer, Integer> map = arrayToHashMap(array);

        return map;
    }
}
