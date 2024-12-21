/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    const ans = [];
    let first = 0;
    let second = n
    while(first<n && second<2*n){
        ans.push(nums[first++]);
        ans.push(nums[second++]);
    }
    return ans;
};