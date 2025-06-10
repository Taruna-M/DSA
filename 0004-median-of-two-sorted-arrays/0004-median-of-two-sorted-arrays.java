class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = nums1, B = nums2;
        if (A.length>B.length){
            int[] temp = A;
            A = B;
            B = temp;
        }
        int n1 = A.length, n2 = B.length, total = n1+n2, half = total/2;
        int low = 0, high = n1;
        while (low<=high){
            int medA = (low+high)/2;
            int medB = half - medA;

            // get the left and right most/least values
            int Aleft = medA>0 ? A[medA-1] : Integer.MIN_VALUE;
            int Aright = medA<n1 ? A[medA] : Integer.MAX_VALUE;
            int Bleft = medB>0 ? B[medB-1] : Integer.MIN_VALUE;
            int Bright = medB<n2 ? B[medB] : Integer.MAX_VALUE;

            if (Aleft<=Bright && Bleft<=Aright){
                if (total%2==0) return (Math.min(Aright, Bright) + Math.max(Aleft, Bleft)) / 2.0;
                else return Math.min(Aright, Bright);
            }

            else if (Aleft>Bright){
                high = medA - 1;
            }
            else low = medA + 1;
        }
        return -1;
    }
}