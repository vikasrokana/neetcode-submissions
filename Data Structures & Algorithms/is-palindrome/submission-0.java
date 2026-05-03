class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] ch = str.toCharArray();
        int left =0 ;
        int right = ch.length-1;
        while(left < right){
          if(ch[left] != ch[right]){
            return false;
          }
          left++;
          right--;
        }
        return true;
        
    }
}
