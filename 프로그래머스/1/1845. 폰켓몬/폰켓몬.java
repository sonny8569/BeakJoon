import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = getMap(nums);
        return answer(nums, map);
    }

    private Map<Integer, Integer> getMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        return map;
    }

    private int answer(int[] nums, Map<Integer, Integer> map) {
        int allow = nums.length / 2;
        if(map.size() > allow) return allow;
        return map.size(); 
    }
}
