package com.hdfclife.algo;

import com.hdfclife.exception.PairNotFoundException;

import java.util.Arrays;

public class PairSumSolver {

    public static String bruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return arr[i] + " + " + arr[j];
                }
            }
        }
        throw new PairNotFoundException("No pair found for: "+target);
    }

    public static String twoPointer(int[] arr, int target){
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);

        int left = 0;
        int right = copy.length -1;

        while (left<right){
            int sum = copy[left]+copy[right];

            if (sum == target){
                return copy[left]+" + "+copy[right];
            }
            if(sum<target){
                left++;
            }
            else {
                right--;
            }
        }
        throw new PairNotFoundException("Pair not found for "+target);
    }
}
