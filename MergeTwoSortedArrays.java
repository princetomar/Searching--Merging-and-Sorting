package GFG_Arrays;

public class MergeTwoSortedArrays
{
    /*
    num[] k
    i = loop over nums1
    j = loop over nums2
    k = used to add ele. in num

    if arr.length %2 == 0

        it's an even no
        int mid = num[0]+num[num.length]/2
    else
        int mid1 = num[0]+num[num.length]
        int mid1 = num[0]+num[num.length]
        int mid = mid1 + mid2 /2
    */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        int num[] = new int[nums1.length + nums2.length];

        for(i=0 ; i<nums1.length ; i++)
        {
            for(j=0 ; j<nums2.length ; j++)
            {
                if(nums1[i] > nums2[j])
                {
                    num[k++] = nums1[i++];
                }
                else if(nums2[j] > nums1[i])
                {
                    num[k++] = nums2[j++];
                }
            }
        }
        // 0 1 2 3 4

        // copying the remaining elements
        for(i=0 ; i<nums1.length ; i++)
        {
            num[k++] = nums1[i++];
        }

        for(j=0 ; i<nums2.length ; j++)
        {
            num[k++] = nums2[j++];
        }

        if(num.length % 2 == 0 )
        {
            // It's Even in length
            int mid1 = num[0]+num[num.length];
            int mid2 = num[0]+num[num.length]-1 ;
            double mid = mid1 + mid2 /2;
            return mid;
        }
        else{
            // It's Odd
            double mid = num[0]+num[num.length]/2;
            return mid;
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int arr2[]= {3,4,5,6,6};
        double d= findMedianSortedArrays(arr,arr2);
        System.out.println(d);
    }




}
