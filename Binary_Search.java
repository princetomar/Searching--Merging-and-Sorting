package com.company;

public class Binary_Search
{
    public static int BinarySearch(int arr[],int ele)
    {
        int start = 0;
        int end = arr.length;
        while (start <= end)
        {
            int mid = (start+ end) /2;
            if(ele == arr[mid])
                return mid;
            else if(ele > arr[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int res = BinarySearch(arr,5);
        System.out.println(res);
    }
}
