// let array=[1,2,3,4,5];
function filter(array, cb) { 
    const result = [];
    for (let i = 0; i < array.length; i++) {
      if (cb(array[i])) {
        result.push(array[i]);
      }
    }
    return result;
  }
  filterArr=filter([1, 2, 3, 4, 5], item => item >= 3);
  console.log(filterArr);

  // callback fn should evaluate to boolean