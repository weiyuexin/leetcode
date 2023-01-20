package leetcode.problems;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: 丢失的数字268
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/20 22:59
 */
public class 丢失的数字268 {
    public static void main(String[] args) {

        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int[] shuzu = new int[n+1];
        for (int i=0;i<n;i++) shuzu[nums[i]]++;
        for (int i=0;i<n+1;i++){
            if (shuzu[i] == 0){
                ans = i;
            }
        }

        return ans;
    }
}
