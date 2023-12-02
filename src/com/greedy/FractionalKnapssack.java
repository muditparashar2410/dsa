package com.greedy;

import java.util.Arrays;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
public class FractionalKnapssack {
	 static double fractionalKnapsack(int W, Item arr[], int n) 
	    {
	    Arrays.sort(arr,(a,b) -> Double.compare((double)b.value/b.weight,(double)b.value/b.weight));
	    double maxvalue=0;
	    for(Item i : arr){
	        if(W-i.weight>=0){
	            maxvalue+=i.value;
	            W -= i.weight;
	        }else{
	              
	            maxvalue += ((double)W/(double)i.weight) * i.value;
	            break;
	        }
	    }
	    return maxvalue;
	    }
	public static void main(String[] args) {
		Item i1= new Item(60, 10);
		Item i2= new Item(100, 20);
		Item i3= new Item(120, 30);
		Item arr[] = {i1,i2,i3};
		System.out.println(fractionalKnapsack(50,arr,arr.length));
	}

}
