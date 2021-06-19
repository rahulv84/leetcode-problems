package com.google.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * https://www.youtube.com/watch?v=rw4s4M3hFfs
 * 
 * 
 * @author rahul
 *
 */

//Blocks = [
//{
//	“gym”: false,
//	“school”: true,
//	“store”: false
//},
//{
//	“gym”: true,
//	“school”: false,
//	“store”: false
//},
//{
//	“gym”: true,
//	“school”: true,
//	“store”: false
//}
//{
//	“gym”: false,
//	“school”: true,
//	“store”: false
//},
//{
//	“gym”: false,
//	“school”: true,
//	“store”: true
//}
//]
//
//Calculate which block is more suitable to live with respect to distance from gym, school, store.
//Answer to this is node 4 here. Make the program.
//Input: gym, school, store.
//output: node 4 data.


public class PerfectBlockToLive {

	
	// this is int array representation of input json. 
	int[][] blocks = {
						{0,1,0},
						{1,0,0}, 
						{1,1,0},
						{0,1,0},
						{0,1,1}
					};
	
	
	// this is hash map representation of input json
	//initializing the input arraylist of blocks
	static Map<String,Boolean> block = new HashMap<String, Boolean>(); //gym, school, store
    static List<Map<String , Boolean>> blockList  = new ArrayList<Map<String,Boolean>>();
    static {
    	block.put("gym", false);
    	block.put("school", true);
	    block.put("store", false);
	    blockList.add(block);
	    
	    block = new HashMap<String, Boolean>();
	    block.put("gym", true);
    	block.put("school", false);
	    block.put("store", false);
	    blockList.add(block);
	    

	    block = new HashMap<String, Boolean>();
	    block.put("gym", true);
    	block.put("school", true);
	    block.put("store", false);
	    blockList.add(block);
	    
	    block = new HashMap<String, Boolean>();
	    block.put("gym", false);
    	block.put("school", true);
	    block.put("store", false);
	    blockList.add(block);
	    
	    block = new HashMap<String, Boolean>();
	    block.put("gym", false);
    	block.put("school", true);
	    block.put("store", true);
	    blockList.add(block);
	    
    }
    
	public static void main(String[] args) {
	
		System.out.println("Input block detail dataset is: -> ");
		
		int i=0;
	    for (Map<String, Boolean> map : blockList) {
	        System.out.print(i++ + ":");
	    	System.out.println(map);
	    }
	    
	    System.out.println("search ideal block for input: gym, school, store");
	    
	    
	}
	
	public static void findPerfectBlock(List <Map<String, Boolean>> blockList, List<String> input) {
		
		
		
	}
	
	
}

























