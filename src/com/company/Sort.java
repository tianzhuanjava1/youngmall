package com.company;

/**
 * @ClassName Sort
 * @Description TODO
 * @Author 杨添成
 * @Date 2022/3/21 21:11
 * @Version 1.0
 */
public class Sort {
    public static void main(String[] args) {
        sort();
    }

    private static void sort(){
        int[] date = {12,33,22,41,3,121,43,123};
        int len =date.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-i-1; j++) {
                if (date[j]>date[j+1]){
                    int temp = date[j+1];
                    date[j+1] = date[j];
                    date[j] = temp;
                }
            }
        }
        for (int k = 0; k < len; k++) {
            System.out.println(date[k]);
        }

    }
}
