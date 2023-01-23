package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _1929数组串联
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/23 22:09
 */
public class _1929数组串联 {
    public static void main(String[] args) {


    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[i + nums.length] = ans[i];
        }
        return ans;
    }
}
