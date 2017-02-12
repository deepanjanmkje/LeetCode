public class SingleNumber {
    public int singleNumber(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int result = 0;
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        for(int i : map.keySet()){
            if(map.get(i) == 1)
            result = i;
        }
        return result;
    }
}