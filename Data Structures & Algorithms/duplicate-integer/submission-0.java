class Solution {
    public boolean hasDuplicate(int[] nums) {
         boolean result = false;
        // HashMap<Integer, Integer> m=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     m.put(nums[i],m.getOrDefault(nums[i],0));
        // }
        // for(Integer count:m.values()){
        //     if(count>1){
        //         result = true;
        //     }
        // }
        // return result;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    result=true;
                }
            }
        }
        return result;
    }
}