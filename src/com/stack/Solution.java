package com.stack;

public class Solution {

		Stack stack = new Stack();    
	    public void deleteMid(Stack s,int sizeOfStack){
	    if(sizeOfStack==sizeOfStack/2){
	        return;
	    }
//	    stack.push(s.pop());
	    deleteMid(s,sizeOfStack-1);
	    s.pop();
//	    while(stack.empty()){
//	        s.push(stack.pop());
	    }
	        
//	    } 
	    public static void main(String[] args) {
	}

}
