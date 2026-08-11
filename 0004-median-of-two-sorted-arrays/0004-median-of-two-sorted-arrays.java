class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;

        int i=0;
        int j=0;
        int k=0;
        int[] arr=new int[m+n];
        while(i<=m-1 && j<=n-1){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                k++;
                i++;
            }else{
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<=m-1){
            arr[k]=nums1[i];
            k++;
            i++;
        }
        while(j<=n-1){
            arr[k]=nums2[j];
            k++;
            j++;
        }

        if((m+n)%2==0){
            return (double)((arr[(m+n-1)/2]+arr[(m+n)/2]))/2;
        }else{
            return arr[k/2]; 
        }
    }
}