package com.pattern;

class Hollow_HourGlass {
    static void printhourglass(int n){
           int row =1;
           int nsp=1;
           int nst=n;
           while (row<2*n){
           for (int csp = 1; csp <= nsp; csp++) {
               System.out.print(" ");
               }
               for (int cst = 1; cst <= nst; cst++) {
                   if(cst==1 || cst == nst || row==1 || row == 2*n-1){
                   System.out.print(" *");
                   }else {
                   System.out.print("  ");
                   }
               }
               System.out.println();
               row++;
               if(row<=n){
                   nst--;
                   nsp++;
               }else{
                   nst++;
                   nsp--;
               }
           }
    }
    public static void main(String[] args) {
    printhourglass(5);
    }
}
