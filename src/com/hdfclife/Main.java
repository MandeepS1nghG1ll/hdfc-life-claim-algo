package com.hdfclife;

import com.hdfclife.algo.*;
import com.hdfclife.exception.AlgorithmException;
import com.hdfclife.store.ClaimAmountStore;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        ClaimAmountStore store = new ClaimAmountStore();

        store.add(25000);
        store.add(18000);
        store.add(42000);
        store.add(15000);
        store.add(31000);
        store.add(9000);

        int[] seed = store.toArray();
        System.out.println("========================================================================================================================");
        System.out.println("Seed Array");
        System.out.println(Arrays.toString(seed));

        System.out.println("========================================================================================================================");
        System.out.println("After inserting, shift: "+store.insert(2,26000));
        store.insert(2,26000);
        System.out.println(Arrays.toString(store.toArray()));

        System.out.println("========================================================================================================================");
        System.out.println("After delete");
        store.delete(2);
        System.out.println(Arrays.toString(store.toArray()));

        System.out.println("========================================================================================================================");
        System.out.println("Brute force pairSum");
        System.out.println(PairSumSolver.bruteForce(seed, 57000));
        System.out.println("2 pointer pairSum");
        System.out.println(PairSumSolver.twoPointer(seed, 57000));

        System.out.println("========================================================================================================================");
        System.out.println("Is Palindrome for 12321: "+PalindromeChecker.isPalindrome(12321));
        System.out.println("Is Palindrome for 12321: "+PalindromeChecker.isPalindrome(18500));

        System.out.println("========================================================================================================================");
        int[] partitionArray = Arrays.copyOf(seed, seed.length);
        PartitionSolver.partition(partitionArray, 20000);
        System.out.println("Partition: "+Arrays.toString(partitionArray));

        System.out.println("========================================================================================================================");
        System.out.println("Max window sum for k=3: "+SlidingWindowSolver.maxSum(seed, 3));

        System.out.println("========================================================================================================================");
        System.out.println("Max Substring of TERMULIPTERM: "+UniqueSubstringSolver.UniqueSubstring("TERMULIPTERM"));

        System.out.println("========================================================================================================================");
        int[] sortedSeed = Arrays.copyOf(seed, seed.length);
        Arrays.sort(sortedSeed);
        System.out.println("Binary Search");
        System.out.println("15000: "+ (BinarySearcher.search(sortedSeed, 15000) ? "Found": "Not Found"));
        System.out.println("999: "+(BinarySearcher.search(sortedSeed, 999) ? "Found": "Not Found"));

        System.out.println("========================================================================================================================");
        try {
            store.insert(99, 999);
        } catch (AlgorithmException e) {
            System.out.println("Message for inserting index 99: "+e.getMessage());
        }

        try {
            PairSumSolver.bruteForce(seed, 1);
        }
        catch (AlgorithmException e){
            System.out.println("Message for Pair sum target 1: "+e.getMessage());
        }


    }
}
