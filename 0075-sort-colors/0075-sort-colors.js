/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    const n = nums.length;
    let zero = 0; two = n-1; current = 0;
    while (current<=two){
        if (nums[current]===2){
            const temp = nums[two];
            nums[two] = nums[current];
            nums[current] = temp;
            two--;
        }
        else if (nums[current]===0){
            const temp = nums[zero];
            nums[zero] = nums[current];
            nums[current] = temp;
            zero++;
            current++;
        }
        else current++;
    }
};