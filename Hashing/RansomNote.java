class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char values:magazine.toCharArray()){
            map.put(values,map.getOrDefault(values,0)+1);
        }
        for(char chars:ransomNote.toCharArray()){
            map.put(chars,map.getOrDefault(chars,0)-1);
            if(map.get(chars)<0)
            return false;
        }
        return true;
    }
}
