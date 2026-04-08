class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map=new HashMap<>();
        String cleankey=key.replace(" ","");
        char nextchar='a';
        for(char word:cleankey.toCharArray()){
            if(!map.containsKey(word)){
                    map.put(word,nextchar++);
        } }
        StringBuilder sb=new StringBuilder();
        for(char ch:message.toCharArray()){
            if(ch==' ')
            sb.append(' ');
            else
            sb.append(map.get(ch));
        }
        return sb.toString();
    }
}
