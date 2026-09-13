/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    const arr=new Array(nums.length);
    let sum=0;
    for(let i=0;i<nums.length;i++){
        arr[i]=sum+nums[i];
        sum+=nums[i];
    }
    return arr;
};