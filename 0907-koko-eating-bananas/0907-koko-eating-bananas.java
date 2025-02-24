class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // low, high, mid => number of bananas, mid = to take per hour
        int low = 1, high =  Arrays.stream(piles).max().getAsInt();
        while (low<=high){
            int mid = (low+high)/2, hours = 0;
            for (int p: piles) hours += Math.ceil(((double) p/mid));
            if (hours<=h) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}