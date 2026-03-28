class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        for(int values:nums1)
        set1.add(values);
        HashSet<Integer> result=new HashSet<>();
        for(int num:nums2){
            if(set1.contains(num))
            result.add(num); } 
        int[] arr=new int[result.size()];
        int i=0;
        for(int values:result)
        arr[i++]=values;
        return arr;  } }
