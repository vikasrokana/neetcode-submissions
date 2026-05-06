class Solution {
    public boolean validPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] ch = str.toCharArray();
        int left=0;
        int right = ch.length -1;
        while(left < right){
            if(ch[left] != ch[right]){
               return isPalidrome(str, left+1, right) || isPalidrome(str, left, right-1);
            }
            left++;
            right--;
        }
        return true;
    }

    boolean isPalidrome(String str, int left, int right){
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}