/**
 * @param {number[]} arr
 * @return {number}
 */
var maxChunksToSorted = function(arr) {
    const n = arr.length;
    let max = 0, count=0, i = 0;
    while(i<n){
        max = Math.max(max, arr[i]);
        if (max===i) count++;
        i++;
    }
    return count;
};