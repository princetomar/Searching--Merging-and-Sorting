package com.company;

public class Merge_Two_Sorted_Array
{
    public static int[] Merge(int[] arr1, int[] arr2)
    {
        int arr3[] = new int[arr1.length+ arr2.length];
        int i=0,j=0,k=0;

        while (i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < arr1.length)
        {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length)
        {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        return arr3;
    }

    public static void main(String[] args) {
        int arr1[] = {2,6,9,15};
        int arr2[] = {1,4,6,7};
        int[] m = Merge(arr1,arr2);
        System.out.println("Merge Result : ");
        for(int i=0 ; i<m.length ; i++)
        {
            System.out.print(m[i]+" ");
        }
    }

}
