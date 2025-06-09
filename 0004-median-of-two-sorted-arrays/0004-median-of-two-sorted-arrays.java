class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = nums1, B = nums2; 
        if (A.length>B.length){ // A is always the smaller array
            int[] temp = A;
            A = B;
            B = temp;
        }
        int n1 = A.length, n2 = B.length;
        int total = n1+n2, half = total / 2;
        int low = 0, high = n1;
        while (low<=high){
            int midA = (low+high)/2;
            int midB = half - midA; 

            int Aleft = midA>0 ? A[midA - 1] : Integer.MIN_VALUE;
            int Aright = (midA)<n1 ? A[midA] : Integer.MAX_VALUE;
            int Bleft = midB>0 ? B[midB - 1] : Integer.MIN_VALUE;
            int Bright = (midB)<n2 ? B[midB] : Integer.MAX_VALUE;

            if (Aleft<=Bright && Bleft<=Aright){
                if (total%2 != 0)return Math.min(Aright, Bright);
                else return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
            }

            else if (Aleft>Bright) high = midA - 1;
            else if (Bleft>Aright) low = midA + 1;
        }
        return -1;

    }
}