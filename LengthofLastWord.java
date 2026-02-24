class Solution {
    public int lengthOfLastWord(String s) {
        char[] a=s.toCharArray();
        int i=a.length-1;
        int count=0;
        while(i>=0&&a[i]==' ')
        i--;
        while(i>=0&&a[i]!=' '){
            i--;
            count++; }
        return count;         
    }
}
