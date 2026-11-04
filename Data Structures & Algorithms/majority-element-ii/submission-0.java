class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int k = nums.length / 3;
        for(int num: nums){
            int count = map.getOrDefault(num, 0) + 1 ;
            map.put(num, count);
        }

        List<Integer> arr = new ArrayList<>();
    
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > k){
                arr.add(entry.getKey());
            }
           
        }

        return arr;
        
    }
}