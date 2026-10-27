class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String st: strs){
            char[] ch = st.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(st);
        }

        List<List<String>> finalResult = new ArrayList<>(map.values());
        return finalResult;
    }
}
