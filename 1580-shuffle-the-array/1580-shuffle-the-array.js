/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    const ans = [];
    let first = 0;
    let second = n
    for (let i = 0; i<2*n; i++){
        if (i%2===0) ans[i] = nums[first++];
        else ans[i] = nums[second++]
    }
    return ans;
};