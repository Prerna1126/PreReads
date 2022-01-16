let arr = [1, 2, 3, 4];
function sumReducer(accumulator, currentValue){
   return (accumulator + currentValue);
}
function reduce(arr, sumReducer) {    
    let accumulator = 0;  
         for(let i=0;i<arr.length;i++)       
         accumulator = sumReducer(accumulator,arr[i]);   
         return accumulator;
 }
const sum = reduce(arr, sumReducer);
console.log(sum);           