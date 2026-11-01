class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();
    
        for(String st: operations){
           
            if(st.equals("+")){
                int n = record.size(); 
                record.add(record.get(n-2) + record.get(n-1));
            }else if(st.equals("C")){
                record.remove(record.size() - 1);

            }
           else if(st.equals("D")){
                record.add(record.get(record.size()-1) * 2);

            } 
            else {
                record.add(Integer.parseInt(st));

            }
        }
        int total = 0;
        for(int score: record){
            total += score;
        }
        
        return total;
    }
}