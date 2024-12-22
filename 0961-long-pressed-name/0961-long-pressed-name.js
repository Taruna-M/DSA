/**
 * @param {string} name
 * @param {string} typed
 * @return {boolean}
 */
var isLongPressedName = function(name, typed) {
    const n1 = name.length, n2 = typed.length
    let i = 0, j = 0;
    while (i<n1 && j<n2){
        if (name[i]===typed[j]){
        let count1 = 1;
        while (i<n1-1 && name[i]===name[i+1]) {
            count1++;
            i++;
        }
        i++;
        let count2 = 1;
        while (j<n2-1 && typed[j]===typed[j+1]) {
            count2++;
            j++;
        }
        j++;
        if (count1>count2) return false;
        }
        else return false;
    }
    if (i<n1 || j<n2) return false;
    else return true;
};
