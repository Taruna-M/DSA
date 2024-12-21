/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
    const n = nums.length;
    let ans = 0;
    for (let i = 0; i<n-1; i++){
        for (let j=i+1; j<n; j++){
            if (nums[i]===nums[j]) ans++;
        }
    }
    return ans;
};