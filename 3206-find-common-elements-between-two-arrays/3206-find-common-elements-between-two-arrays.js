/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var findIntersectionValues = function(nums1, nums2) {
    const n1 = nums1.length;
    const n2 = nums2.length;
    let ans1 = 0;
    let ans2 = 0;
    for (let num of nums1){
        if (nums2.includes(num)) ans1++;
    }
    for (let num of nums2){
        if (nums1.includes(num)) ans2++;
    }
    return [ans1,ans2];
};