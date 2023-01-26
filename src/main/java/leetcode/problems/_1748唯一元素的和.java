package leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _1748唯一元素的和
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/26 12:24
 */
public class _1748唯一元素的和 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }
    public static int sumOfUnique(int[] nums) {
        int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i:nums){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        for (int i:nums){
            if (map.get(i) == 1){
                ans+=i;
            }
        }

        return ans;
    }
}
