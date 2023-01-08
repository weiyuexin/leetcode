package leetcode.problems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: SingleNumber136
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/8 19:10
 * @Problem https://leetcode.cn/problems/single-number/
 */
public class SingleNumber136 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 4;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 1;
        nums[4] = 2;
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        /*int ans = 0;
        int[] a = new int[10];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i],0);
            }else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for (int i=0;i<nums.length;i++){
            if (map.get(nums[i]) == 0){
                ans = nums[i];
                break;
            }
            //System.out.print(map.get(nums[i])+" ");
        }

        return ans;*/
        /**
         * 最优解：使用异或运算
         */
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++ ){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
