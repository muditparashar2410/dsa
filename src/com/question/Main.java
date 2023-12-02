package com.question;

	public class Main{ 
		public static int multiply(int a , int b) {
			       String bStr = String.valueOf(b);
			        int ans = 0;

			        for (int i = 0; i < bStr.length(); i++) {
			            ans += a * Character.getNumericValue(bStr.charAt(bStr.length() - i - 1)) * Math.pow(10, i);
			        }
			        System.out.println(ans);
			        return ans;
			}  

			
		
		public static void main(String[] args)
	{
	int a =123; 
	int b =456;
	System.out.println(multiply(a, b));
	}
	}
