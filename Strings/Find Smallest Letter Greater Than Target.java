class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        String s=new String(letters);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>target)
             return s.charAt(i);
        }
        return s.charAt(0);
    }
}
