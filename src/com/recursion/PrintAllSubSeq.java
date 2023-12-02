package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSeq {


    public static void main(String[] args) {
        int arr[] = {3, 1, 2};
        int n = 3;
        ArrayList<Integer> list = new ArrayList<>();
        printallsubsequence(0, list, arr, 3);
    }

    private static void printallsubsequence(int idx, ArrayList<Integer> list, int[] arr, int n) {
        if (idx == n) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
            if (list.size() == 0) {
                System.out.println("{}");
            }
            return;
        }
//        not pick condition
        printallsubsequence(idx + 1, list, arr, n);

//        take condition
        list.add(arr[idx]);
        printallsubsequence(idx + 1, list, arr, n);
        list.remove(list.get(list.size() - 1));

    }
}
