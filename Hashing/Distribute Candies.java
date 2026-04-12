class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int values:candyType){
            set.add(values);
        }
        return Math.min(set.size(),candyType.length/2);
    }
}
