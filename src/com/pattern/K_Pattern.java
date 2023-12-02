package com.pattern;

class K_Pattern {
    static void printK(int n){
        int nst = 2*n-1 ;
        int row = 1 ;
        int count=9;
        while(row<2*n){
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(" "+count);
            }
            System.out.println();

            row++;
            if(row <= n){
            count=count-2;
            nst-=2;
            }else {
            count=count+2;
                nst+=2;
            }
        }



    }
    public static void main(String[] args) {
        printK(5);
    }
}
