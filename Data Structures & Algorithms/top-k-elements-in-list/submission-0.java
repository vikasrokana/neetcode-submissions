class Solution {
    public int[] topKFrequent(int[] nums, int k) {
   // 1. count the frequency of element

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
   // 2. create a min Heap 
   PriorityQueue< int[]> heap = new PriorityQueue<>(
     (a, b) -> a[1] - b[1]);
    
    // 3. put the element in the heap

  for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        heap.offer(new int[]{entry.getKey(), entry.getValue()});
        if(heap.size() > k){
            heap.poll();
        }

    }

    // 4. create a array 
    int[] arr = new int[k];
    for(int i=k-1; i>=0; i--){
        arr[i] = heap.poll()[0];
    }

    return arr;    

    }
}
