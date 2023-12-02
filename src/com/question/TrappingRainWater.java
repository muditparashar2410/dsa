package com.question;

public class TrappingRainWater {
	public static int trap(int[] height) {
		 int water=0;
	        for(int i = 1 ;i < height.length ; i++){
	            int maxleft=height[0];
	            int maxright=height[height.length-1];
	            for(int j=0; j< i ;j++){
	                    if(maxleft<height[j]){
	                        maxleft=height[j];
	                    }
	                }
	            for(int z=height.length-1;z>0;z--){
	                        if(maxright<height[z]){
	                            maxright=height[z];
	                        }
	                    }
	            int min = Math.min(maxright,maxleft);
	            water =water +min  - height[i];
	            }
	        return water;
    }

	public static void main(String[] args) {
		int height[] = {3,1,2,4,0,1,3,2};
		System.out.println(TrappingRainWater.trap(height));
	}

}
