package com.codes;

public class C03_SecondSmallest {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 4, 1, 3, 10, 8, 7 };

        int smallest = arr[0], secondSmallest = arr[0];

        for(int i=1;i<arr.length;i++){
            int num = arr[i];
            if(num < smallest){
                secondSmallest = smallest;
                smallest = num;
            }
        }

        System.out.println(secondSmallest);
    }
}
