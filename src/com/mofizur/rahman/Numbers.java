package com.mofizur.rahman;

import java.math.BigInteger;
import java.util.HashSet;

/**
 * Created by mofi on 4/18/16.
 */
public class Numbers {
    public void moveZeroes(int[] nums) {
        removeElement(nums, 0);
    }

    public int removeElement(int[] nums, int val) {
        int distance = 1;
        int instance = 0;
        int size = nums.length;
        for (int i = 0; i < size - distance; i++) {
            if (nums[i] == val) {
                while (i + distance < size - 1 && nums[i + distance] == val) {
                    distance++;
                }
                swap(nums, i, i + distance);
            }
        }
        while (nums[--size] == val) {

        }
        return size + 1;
    }

    public void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public boolean isPowerOfFour(int num) {
        BigInteger bi = new BigInteger(Integer.toString(num));
        int bitLength = bi.bitLength();

        return num > 0 && (num & num - 1) == 0 && bitLength % 2 == 1;
    }

    public boolean containsDuplicate(int[] nums) {
        boolean duplicate = false;
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int num : nums) {
            if (!(hs.add(num)))
                duplicate = true;
        }
        return duplicate;
    }
}
