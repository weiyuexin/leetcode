package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _2006差的绝对值为K的数对数目
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/24 23:04
 */
public class _2006差的绝对值为K的数对数目 {
    public static void main(String[] args) {
        int[] nums = new int[4];
        int k = 1;
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 2;
        nums[3] = 1;
        System.out.println(countKDifference(nums,k));
    }
    public static int countKDifference(int[] nums, int k) {
        int ans = 0;
        for (int i=0;i<nums.length;i++){
            for (int j = i + 1;j<nums.length;j++){
                if (Math.abs(nums[i] - nums[j]) == k) ans++;
            }
        }
        return ans;
    }
}
