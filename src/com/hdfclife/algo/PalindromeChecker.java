package com.hdfclife.algo;

import java.util.Arrays;

public class PalindromeChecker {

    public static boolean isPalindrome(int num){
        String s = Integer.toString(num);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }

        int left = 0;
        int right = arr.length-1;

        while (left<right){
            if (arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
