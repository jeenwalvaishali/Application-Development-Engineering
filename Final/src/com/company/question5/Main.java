package com.company.question5;

/*Question 5: Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
public int findKthLargest(int[] nums, int k) {
         //TODO: Write your code here
}
* */

import java.util.Random;

public class Main {

    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        System.out.println("Largest Element " + findKthLargest(nums, k));

    }

    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        if(n==1) return nums[n-1];
        else{
            select(nums, 0, n-1, k);
            return nums[k-1];
        }
    }

    public static void select(int[] nums, int l, int h, int k){
        if(l<h){
            int p = partition(nums, l, h);
            if(p < k - 1)
                select(nums, p+1, h, k);
            else if(p > k - 1)
                select(nums, l, p-1 , k);
        }
    }

    public static int partition(int[] nums, int l, int h){
        Random r = new Random();
        int pIndex = r.nextInt(h-l) + l, loc = l, tmp;

        tmp = nums[pIndex];
        nums[pIndex] = nums[h];
        nums[h] = tmp;

        int pivot = nums[h];
        for(int i=l;i<h;i++){
            if(nums[i] > pivot){
                tmp = nums[i];
                nums[i] = nums[loc];
                nums[loc++] = tmp;
            }
        }

        tmp = nums[h];
        nums[h] = nums[loc];
        nums[loc] = tmp;

        return loc;
    }

}
