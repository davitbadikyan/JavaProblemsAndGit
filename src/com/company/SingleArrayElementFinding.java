package com.company;

public class SingleArrayElementFinding {

    public static int findNonRepeating(int[] arr, int n)
    {
        int res = 0;
        for (int i = 0; i < n; i++)
            res = res ^ arr[i];
        return res;
    }

    public static void main (String[] args)
    {
        int []arr = {3, 8, 3, 2, 2, 1, 1};
        int n = arr.length;
        System.out.println(findNonRepeating(arr, n));
    }
}
