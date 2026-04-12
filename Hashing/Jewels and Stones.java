class Solution {
    public int numJewelsInStones(String jewels, String stones) {
            HashMap<Character,Integer> map=new HashMap<>();
            for(char s:stones.toCharArray()){
                map.put(s,map.getOrDefault(s,0)+1);
            }
            int count=0;
            for(char j:jewels.toCharArray()){
                if(map.containsKey(j))
                count=count+map.get(j);
            }
            return count;
            } }
