class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char word=t.charAt(i);
        if(map.containsKey(ch)){
            if(!map.get(ch).equals(word))
                return false;
        }
        else{
            if(set.contains(word))
            return false;
            map.put(ch,word);
            set.add(word);
        }
    }
        return true;
    }
}
