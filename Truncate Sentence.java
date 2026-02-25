class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr=s.split(" ");
        String[] arr1=Arrays.copyOf(arr,k);
        return String.join(" ",arr1);
    }
}
