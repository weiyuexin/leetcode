package leetcode.problems;

import java.util.*;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: MajorityElement169
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/8 21:30
 * @Problem https://leetcode.cn/problems/majority-element/
 */
public class MajorityElement169 {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 3;
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        /*int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i],1);
            }else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for (int i=0;i<nums.length;i++){
            if (map.get(nums[i]) > nums.length/2){
                ans = nums[i];
            }
        }
        return ans;*/
        /**
         * 解法二：先数组排序，再取中间值
         */
        Arrays.sort(nums);
        int ans = 0;
        if(nums.length>1){
            ans = nums.length%2==0 ? nums[nums.length/2]: nums[(nums.length-1)/2];
        }else {
            ans = nums[0];
        }
        return ans;
    }
}
