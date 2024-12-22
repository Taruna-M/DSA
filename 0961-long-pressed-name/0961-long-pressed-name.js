/**
 * @param {string} name
 * @param {string} typed
 * @return {boolean}
 */
var isLongPressedName = function(name, typed) {
    const n1 = name.length, n2 = typed.length
    let i = 0, j = 0;
    while (j<n2){
        if (i<n1 && name[i]===typed[j]) {
            i++;
            j++;
        }
        else if (j>0 && typed[j]===typed[j-1]) j++;
        else return false;
    }
    return i===n1;
};
