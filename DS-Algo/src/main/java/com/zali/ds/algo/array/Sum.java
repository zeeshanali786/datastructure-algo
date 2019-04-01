package com.zali.ds.algo.array;

public class Sum {
    public static int[] returnList(int[] l1, int[] l2) {
        int[] returnArray = new int[l1.length + 1];
        int i = 0;
        int carry = 0;
        while (i < l1.length && i < l2.length) {
            int sum = l1[i] + l2[i] + carry;


            carry = sum / 10;
            returnArray[i] = sum % 10;


            i++;
        }

        returnArray[i] = carry;
        return returnArray;
    }
}
