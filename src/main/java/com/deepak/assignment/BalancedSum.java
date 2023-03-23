package com.deepak.assignment;

public class BalancedSum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int ans = findPivotIndex(arr);
        System.out.println(ans);
    }

    public static int findPivotIndex(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (leftSum == totalSum - leftSum - arr[i]) {
                return i;
            }
            leftSum += arr[i];
        }

        return -1; // no pivot found
    }
}
