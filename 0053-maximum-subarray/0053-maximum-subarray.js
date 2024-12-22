/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    const n = nums.length;
    let max = nums[0], current = nums[0];
    for (let i=1; i<n; i++){
        current = Math.max(current+nums[i], nums[i]);
        max = Math.max(current, max)
    }
    return max;
};