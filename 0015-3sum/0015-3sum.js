/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    const n = nums.length; 
    nums.sort((a,b)=> a-b);
    let ans = [];
    for (let i = 0; i<n; i++) {
        const a = nums[i];
        if (a>0) break;
        if (i>0 && a===nums[i - 1]) continue;
        let j = i+1
        let k = n-1;
        while (j<k) { 
            const sum = a + nums[j] + nums[k];
            if (sum>0) k--;
            else if (sum<0) j++;
            else {
                ans.push([a, nums[j], nums[k]]);
                j++;
                k--;
                while (j<k && nums[k] === nums[k + 1]) k--;
            }
        }
    }
    return ans;
};