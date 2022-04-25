package com.company;

import java.lang.reflect.Array;

import static jdk.nashorn.internal.objects.Global.println;
import static jdk.nashorn.internal.runtime.ScriptObject.GET_ARRAY;

/**
 * @ClassName CaiBi
 * @Description TODO
 * @Author 杨添成
 * @Date 2022/3/17 18:51
 * @Version 1.0
 */
public class CaiBi {
    public static void main(String[] args) {
        sort();
    }
        public static void sort(){
        int[] date ={100,200,110,2,111,113,23,222};
        int len = date.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-1-i; j++) {
                if (date[j]>date[j+1]){
                    int temp = date[j+1];
                    date[j+1] = date[j];
                    date[j]= temp ;
                }
            }
        }
        for (int z = 0; z< len; z++) {
                System.out.println(date[z]);
            }
        }

}
