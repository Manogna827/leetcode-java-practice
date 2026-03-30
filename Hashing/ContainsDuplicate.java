class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        for(int values:nums){
            if(map.contains(values))
                return true;
            map.add(values);
        }
        return false;   }    }
