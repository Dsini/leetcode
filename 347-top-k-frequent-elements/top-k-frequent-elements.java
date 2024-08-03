class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }

    return map.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).limit(k).mapToInt(i -> i.getKey()).toArray();
        

         
        
    }
}