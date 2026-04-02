class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int values:nums){
            map.put(values,map.getOrDefault(values,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>nums.length/2)
            return entry.getKey();
        }
        return -1;   } }
