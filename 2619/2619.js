/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = function() {
    if (this.length > 0) {
       // Return the last element
       return this[this.length - 1];
   } else {
       // Return -1 if the array is empty
       return -1;
   }
};

/**
* const arr = [1, 2, 3];
* arr.last(); // 3
*/