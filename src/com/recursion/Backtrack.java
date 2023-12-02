package com.recursion;

import java.lang.Character.Subset;
import java.util.*;

public class Backtrack {
	public static void func(int [] arr , int i,List<Integer> sub,List<List<Integer>> res){
        if(i==arr.length){
    res.add(new ArrayList<Integer>(sub));
            return ;
        }
    //    yes choice
    sub.add(arr[i]);
    func(arr,i+1,sub,res);
    sub.remove(sub.size()-1);
    //no choice
    func(arr,i+1,sub,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> sub = new ArrayList<>();
     func(nums,0,sub,res);
     return res;
        
    }
	public static void main(String[] args) {
		int [] arr = {1,2,3};
		Backtrack bq = new Backtrack();
		List<List<Integer>> res = bq.subsets(arr);
		for (List<Integer> list : res) {
			System.out.println(list);
		}
	}

}
