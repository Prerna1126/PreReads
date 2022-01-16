let arr = [1, 2, 3, 4, 5];
function map(arr, mapFunc){ //callbackfunction

    const mapArr = []; // empty array        
        
    for(let i=0;i<arr.length;i++) {        
        const result = mapFunc(arr[i]);        
        mapArr.push(result);    
    } 
   return mapArr;
}

squareArr= map(arr, num => num ** 2);
console.log(squareArr);

////////
/* let arr = [1, 2, 3, 4, 5];
function map(arr, callbackf){ //callbackfunction

    const mapArr = []; // empty array        
        
    for(let i=0;i<arr.length;i++) {        
        const result = callbackf(arr[i]);        
        mapArr.push(result);    
    } 
   return mapArr;
}
function mapFunc() {
    num=>num*2;
}
squareArr= map(arr, mapFunc);
console.log(squareArr);
//output why [ undefined, undefined, undefined, undefined, undefined ] */

//////////

/* let arr = [1, 2, 3, 4, 5];

squareArr = arr.map(num => num ** 2); //using inbuilt function

console.log(squareArr); */

