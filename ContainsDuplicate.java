public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i : nums){
            s.add(i);
        }
        if(s.size() != nums.length)
            return true;
        return false;
    }
}