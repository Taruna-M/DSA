/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var countKDifference = function(nums, k) {
    const n = nums.length;
    let ans = 0;
    for (let i = 0; i<n-1; i++){
        for (let j = i+1; j<n; j++){
            if (Math.abs(nums[i]-nums[j])===k) ans++;
        }
    }
    return ans;
};