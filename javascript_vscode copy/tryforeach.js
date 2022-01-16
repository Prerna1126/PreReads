let sum=0;
const numbers=[10,20,30,40];
function forEach(numbers,myFunc){
    for(let i=0;i<numbers.length;i++){
        myFunc(numbers[i]);
    }

}
function myFunc(item){
    sum+=item;
}
forEach(numbers,myFunc);
console.log(sum);




