class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result=new ArrayList<>();
        for(String word:words){
            if(matches(word,pattern))
            result.add(word);
        }
        return result;
    }
    private boolean matches(String word,String pattern){
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<word.length();i++){
            char p=pattern.charAt(i);
            char w=word.charAt(i);
        if(map.containsKey(p)){
            if(!map.get(p).equals(w)) return false;
        }
        else{
            if(set.contains(w)) return false;
            map.put(p,w);
            set.add(w);
        }
        }
        return true;
    }
}
