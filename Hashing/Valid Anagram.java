class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())   return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char set1:s.toCharArray()){
            map.put(set1,map.getOrDefault(set1,0)+1);
        }
        for(char set2:t.toCharArray()){
            map.put(set2,map.getOrDefault(set2,0)-1);
        }
        for(int count:map.values()){
            if(count!=0)
            return false;
        }
        return true;
    }
}
