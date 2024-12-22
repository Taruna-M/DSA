/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    const n = nums.length;
    let pre = 1, post = 1;
    let ans = Array(n).fill(1);
    for (let i = 0; i<n; i++){
        ans[i]*=pre;
        pre*=nums[i];
        ans[n-i-1]*=post;
        post*=nums[n-i-1]
    }
    return ans;
}