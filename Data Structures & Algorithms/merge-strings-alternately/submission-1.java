class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0, j=0;
        int w1Len = word1.length();
        int w2Len = word2.length();
        StringBuilder str = new StringBuilder();
        while(i < w1Len || j < w2Len){
            if(i < w1Len){
                str.append(word1.charAt(i++));
            }
            if(j < w2Len){
                str.append(word2.charAt(j++));
            }
        }

        return str.toString();
    }
}