package com.codes;

public class C02_SecondSmallest {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 4, 1, 3, 10, 8, 7 };;

        int largest = arr[0], secondLargest = arr[0];

        for(int i=1;i<arr.length;i++){
            int num = arr[i];
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
        }

        System.out.println(secondLargest);
    }
}
