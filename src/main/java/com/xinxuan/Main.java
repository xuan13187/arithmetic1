package com.xinxuan;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int[] arr1 = new int[10];
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = new Random().nextInt(100);
//        }
//        System.out.println(Arrays.toString(arr1));
        int [] arr2 ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumMethod(arr2, 3, 3));
    }
    public static void selectOrder(int[] arr){
        for (int end = 1; end < arr.length ; end++) {
            int newArrIndex = end;
            while (newArrIndex-1>=0&&arr[newArrIndex]<arr[newArrIndex-1]){
                int temp = arr[newArrIndex];
                arr[newArrIndex] = arr[newArrIndex-1];
                arr[newArrIndex-1] = temp;
                newArrIndex--;
            }
        }
    }

    public static int sumMethod(int[] arr,int L, int R){
        int N = arr.length;
        int[] preSumArr = new int[N];
        preSumArr[0] = arr[0];
        for (int i = 1; i < N; i++) {
            preSumArr[i] =preSumArr[i-1] + arr[i];
        }
       return L == 0 ? preSumArr[R] : preSumArr[R] - preSumArr[L-1];
//        if (L < 0){
//            System.out.println("输入错误，请输入大于等于0的值！");
//            return -1;
//        }else if (L == 0){
//            return preSumArr[R];
//        }else {
//            return preSumArr[R] - preSumArr[L-1];
//        }
    }

}