package com.leetcode;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * @author rahul
 *
 */
public class RemoveDuplicatesFromSortedArray {

	
	static int [] nums1 = {1,1,2,2,3,3};
	

	public static void main(String[] args) {
		
		System.out.println("before -> " );
		printArray(nums1);
		
		System.out.println("duplicates removed -> " + removeDuplicatesUsingSet(nums1));
		
		System.out.println("after -> ");
		printArray(nums1);
		
	}
	
	public static void printArray(int[] arr) {
		
		for(int i: arr) {
			System.out.print(i);
			System.out.print(',');
		}
	}
	
	/**
	 * @param nums
	 * @return
	 */
	public static int removeDuplicates(int[] nums) {

		int duplicate = 0;
		int prev = 0;
		int current = 0;
		
		int marker = nums[0]-1;
		
		for (int i=0; i<nums.length; i++) {
			current = nums[i];
			
			if(current == prev) {
				//remove current and pull back array by 1
				//or mark this index for later removal
				nums[i] = marker;
				++duplicate;
				
			}
			prev = current;
			
		}
    
		return duplicate;
	}
	
	public static int removeDuplicatesUsingSet(int[] nums) {

		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i : nums) {
			set.add(i);
		}
		
	
	
		Iterator<Integer> iter = set.iterator();
		
		for (int i = 0; i < set.size(); i++) {
			nums[i] = iter.next();
		}
		
		
		return set.size();
	}
	
}
