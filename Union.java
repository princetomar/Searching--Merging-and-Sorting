package GFG_Arrays;
import java.lang.Math.*;
public class Union
{
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        int count = Math.max(n,m);
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j< m ; j++)
            {
                if(a[i] == b[j] )
                {
                    count ++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int arr2[] = {1,2,3};
        int m = arr2.length;

        int d = doUnion(arr,n,arr2,m);
        System.out.println(d);
    }
}
