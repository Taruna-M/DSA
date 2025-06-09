class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] arr = new int[n1+n2];
        int i = 0, j = 0, k = 0;
        while (i<n1 && j<n2){
            if (nums1[i]<=nums2[j]) arr[k++] = nums1[i++];
            else arr[k++] = nums2[j++];
        } 
        
        while (i<n1){
            arr[k++] = nums1[i++];
        }

        while (j<n2){
            arr[k++] = nums2[j++];
        }

        if ((n1+n2)%2 == 0) return (arr[((n1+n2)/2)-1] + arr[((n1+n2)/2)]) / 2.0;
        else return (double) arr[(0+(n1+n2-1))/2];

    }
}